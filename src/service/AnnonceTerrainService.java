/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AnnonceTerrain;
import bean.PhotoTerrain;
import bean.Quartier;
import bean.TypeTerrain;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jawadoo
 */
public class AnnonceTerrainService  extends AbstractFacade<AnnonceTerrain>{
    
    public AnnonceTerrainService() {
        super(AnnonceTerrain.class);
    }
    PhotoTerrainService photoTerrainService = new PhotoTerrainService();
    
     public AnnonceTerrain creeAnnonce(String refAnnonce, double surface,double prix, Quartier quartier ,TypeTerrain typeTerrain ) {
        AnnonceTerrain at = new AnnonceTerrain();
        at.setRefAnnonce(refAnnonce);
        at.setSurface(surface);
        at.setPrix(prix);
        at.setQuartier(quartier);
        at.setTypeTerrain(typeTerrain);
        at.setCloture(true);
        create(at);
        return at;
    }
   public int clotureAnnonce(AnnonceTerrain a) {
        if (a.isCloture() == false) {
            return -1;
           } 
        else {
            a.setCloture(false);
            edit(a);
            return 1;
        }
    }
    
      public List<AnnonceTerrain> searchByCreteria( Double surfaceMin,Double surfaceMax, Quartier quartier ,TypeTerrain typeTerrain){
        String query =constructQuery( surfaceMin,surfaceMax, quartier, typeTerrain);
        return getEntityManager().createQuery(query).getResultList();
    }
      
    private String constructQuery( Double surfaceMin,Double surfaceMax,  Quartier quartier ,TypeTerrain typeTerrain){
        String query = "SELECT a FROM AnnonceTerrain a WHERE 1=1";
//        if(surface!= null){
//            query += " AND a.surface = '"+surface+"'";
//              return query;
//        }
        
        if(surfaceMin!= null){
            query += " AND a.surface >= '"+surfaceMin+"'";
        }
        
        if(surfaceMax!= null && !surfaceMax.toString().equals("")){
            query += " AND a.surface <= '"+surfaceMax+"'";
        }
        if(quartier!= null && quartier.getIdQuartier()!=null){
            query += " AND a.quartier.idQuartier = '"+quartier.getIdQuartier()+"'";
        }
        if(typeTerrain!= null && typeTerrain.getIdType()!=null){
            query += " AND a.typeTerrain.idType = '"+typeTerrain.getIdType()+"'";
        }
        System.out.println(query);
        return query;   
    }
    
    public int deleteByRefAnnonce(String refAnnonce){       //suprimer l'annonce 
         remove (new AnnonceTerrain(refAnnonce ));
         return 1;
     }
      public List<AnnonceTerrain> findByIdQuartier(long idQuartier) { // trouver les annonce associe a un Quartier 
        String query = "SELECT a FROM AnnonceTerrain a where a.quartier.idQuartier='" +idQuartier + "' ";
        return getEntityManager().createQuery(query).getResultList();
    } 
      
       public List<AnnonceTerrain> findByIdType(long idType) { // trouver les annonce associe a un type de terrain 
        String query = "SELECT a FROM AnnonceTerrain a where a.typeTerrain.idType='" +idType + "' ";
        //return getEntityManager().createQuery(query).getResultList();
        return getMultipleResult(query);
    } 
       public int ModifierAnnonce(String refAnnonce, double  surface, double prix, Quartier quartier, TypeTerrain typeTerrain){
          String query="UPDATE AnnonceTerrain SET surface='"+surface+"' , prix='"+prix+"' , quartier.getIdQuartier()='"+quartier.getIdQuartier()+"' , typeTerrain.getIdType()='"+typeTerrain.getIdType()+"' WHERE refAnnonce='"+refAnnonce+"'";
           return getEntityManager().createQuery(query).executeUpdate();
       }
}