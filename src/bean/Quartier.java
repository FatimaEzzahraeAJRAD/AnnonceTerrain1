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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jawadoo
 */
@Entity
public class Quartier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idQuartier;
    private String nom;
    @ManyToOne
    private Ville ville ;
    @OneToMany(mappedBy = "quartier")
    private List<AnnonceTerrain> annonceTerrains;

    public Quartier(Long idQuartier, String nom, Ville ville) {
        this.idQuartier = idQuartier;
        this.nom = nom;
        this.ville = ville;
    }

    public Quartier(List<AnnonceTerrain> annonceTerrains) {
        this.annonceTerrains = annonceTerrains;
    }

    public Quartier() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

   

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Long getIdQuartier() {
        return idQuartier;
    }

    public void setIdQuartier(Long idQuartier) {
        this.idQuartier = idQuartier;
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
        hash += (idQuartier != null ? idQuartier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartier)) {
            return false;
        }
        Quartier other = (Quartier) object;
        if ((this.idQuartier == null && other.idQuartier != null) || (this.idQuartier != null && !this.idQuartier.equals(other.idQuartier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Quartier{" + "id=" + idQuartier + ", nom=" + nom + ", ville=" + ville + '}';
    }

   
    
}
