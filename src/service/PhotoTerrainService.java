/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AnnonceTerrain;
import bean.PhotoTerrain;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jawadoo
 */
public class PhotoTerrainService  extends AbstractFacade<PhotoTerrain>{

    public PhotoTerrainService() {
        super(PhotoTerrain.class);
    }
    
    public void ajouterPhotoTerrain( String id , String  cheminPhoto, AnnonceTerrain annonceTerrain) {
         PhotoTerrain photoTerrain = new PhotoTerrain();
       photoTerrain.setCheminPhoto(cheminPhoto);
        photoTerrain.setAnnonceTerrain(annonceTerrain);
        create(photoTerrain);
    }
    
     public List<AnnonceTerrain> findByIdAnnonce(String idAnnonce) { // trouver les photos associe a une annonce 
        String query = "SELECT ph FROM PhotoTerrain ph where ph.annonceTerrain.idAnnonce='" + idAnnonce+ "' ";
        return getEntityManager().createQuery(query).getResultList();
    }
     
     public int deleteByIdAnnonce(String idAnnonce) {    // suprimer les photo associe a une annonce
        String query = "DELECTE ph FROM PhotoTerrain ph where ph.annonceTerrain.idAnnonce='" + idAnnonce + "' "; 
        return getEntityManager().createQuery(query).executeUpdate();
    }
}
