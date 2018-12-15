/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Jawadoo
 */
@Entity
public class PhotoTerrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String  cheminPhoto ;
  
    @ManyToOne
    private AnnonceTerrain annonceTerrain;

    public PhotoTerrain() {
    }

    public PhotoTerrain(String id, String cheminPhoto, String rib) {
        this.id = id;
        this.cheminPhoto = cheminPhoto;
        this.annonceTerrain = annonceTerrain;
    }

    public String getCheminPhoto() {
        return cheminPhoto;
    }

    public void setCheminPhoto(String cheminPhoto) {
        this.cheminPhoto = cheminPhoto;
    }

    public AnnonceTerrain getAnnonceTerrain() {
        return annonceTerrain;
    }

    public void setAnnonceTerrain(AnnonceTerrain annonceTerrain) {
        this.annonceTerrain = annonceTerrain;
    }

    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhotoTerrain)) {
            return false;
        }
        PhotoTerrain other = (PhotoTerrain) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhotoTerrain{" + "id=" + id + ", cheminPhoto=" + cheminPhoto + ", annonceTerrain=" + annonceTerrain + '}';
    }

   
    
}
