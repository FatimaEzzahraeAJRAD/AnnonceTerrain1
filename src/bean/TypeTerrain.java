/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Jawadoo
 */
@Entity
public class TypeTerrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idType;
    private String libbele;
    @OneToMany(mappedBy = "typeTerrain")
    private List<AnnonceTerrain> annonceTerrains;

    public TypeTerrain(Long idType, String libbele) {
        this.idType = idType;
        this.libbele = libbele;
    }

    public TypeTerrain(List<AnnonceTerrain> annonceTerrains) {
        this.annonceTerrains = annonceTerrains;
    }

    public TypeTerrain() {
    }

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getLibbele() {
        return libbele;
    }

    public void setLibbele(String libbele) {
        this.libbele = libbele;
    }

   

    public List<AnnonceTerrain> getAnnonceTerrains() {
        return annonceTerrains;
    }

    public void setAnnonceTerrains(List<AnnonceTerrain> annonceTerrains) {
        this.annonceTerrains = annonceTerrains;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeTerrain)) {
            return false;
        }
        TypeTerrain other = (TypeTerrain) object;
        if ((this.idType == null && other.idType!= null) || (this.idType!= null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TypeTerrain{" + "idType=" + idType + ", libbele=" + libbele + '}';
    }

   
}
