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
    
//    private void intDB(){
//        for (int i = 0; i < 10; i++) {
//            creeAnnonce("EE"+i, 2*i);
//        }
//        
//    }
    
     public AnnonceTerrain creeAnnonce(String idAnnonce, double surface ) {
        AnnonceTerrain at = new AnnonceTerrain();
        at.setIdAnnonce(idAnnonce);
        at.setSurface(surface);
        at.setCloture(true);
        create(at);
        return at;
    }
  
    
     public void saveAnnonce(AnnonceTerrain annonceTerrain, List<PhotoTerrain> PhotoTerrains){ // crée une Annonce et ces photos
         create(annonceTerrain);
         for (PhotoTerrain photoTerrain : PhotoTerrains)        
 {
             photoTerrain.setAnnonceTerrain(annonceTerrain);
             create(annonceTerrain);
             photoTerrainService.create(photoTerrain);
         }
     }
     
      public List<AnnonceTerrain> searchByCreteria(String idAnnonce, Double surface, long idQuartier , long idType){
        String query =constructQuery( idAnnonce,  surface,  idQuartier ,  idType);
        return getEntityManager().createQuery(query).getResultList();
    }
      
    private String constructQuery(String idAnnonce, Double surface,  long idQuartier , long idType){
        String query = "SELECT c FROM Compte c WHERE 1=1";
        if(idAnnonce != null && !idAnnonce.equals("")){
            query += " AND c.rib = '"+idAnnonce+"'";
            return query ;
        }
        if(surface!= null&& !surface.toString().equals("")){
            query += " AND c.solde >= '"+surface+"'";
        }
        
        if(idQuartier!= null && !idQuartier.toString().equals("")){
            query += " AND c.solde <= '"+idQuartier+"'";
        }
        if(idType!= null && !idType.toString().equals("")){
            query += " AND c.solde <= '"+idType+"'";
        }
        return query;
        
        
    }
    
    public void deleteByIdAnnonce(String idAnnonce){       //suprimer l'annonce et ces photos
         photoTerrainService.deleteByIdAnnonce(idAnnonce);
         remove (new AnnonceTerrain( idAnnonce ));
     }
}