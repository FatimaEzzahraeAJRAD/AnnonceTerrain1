/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Jawadoo
 */
@Entity
public class AnnonceTerrain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String idAnnonce ;
    private double prix ;
     private char description ;
    private double surface;
    private boolean cloture;
    private double prixDeVente ;
    @ManyToOne
    private  Quartier  quartier;
    @ManyToOne
    private  TypeTerrain typeTerrain;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "annonceTerrain")
    private List<PhotoTerrain> photoTerrains;

   

    public AnnonceTerrain(String idAnnonce, double prix, char description, double surface, boolean cloture, double prixDeVente, Quartier quartier, TypeTerrain type, User user, List<PhotoTerrain> photoTerrains) {
        this.idAnnonce = idAnnonce;
        this.prix = prix;
        this.description = description;
        this.surface = surface;
        this.cloture = cloture;
        this.prixDeVente = prixDeVente;
        this.quartier = quartier;
        this.typeTerrain = typeTerrain;
        this.user = user;
        this.photoTerrains = photoTerrains;
    }

    public AnnonceTerrain() {
    }

    public AnnonceTerrain(String idAnnonce) {
        this.idAnnonce = idAnnonce;
    }


   
    public String getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce(String idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public char getDescription() {
        return description;
    }

    public void setDescription(char description) {
        this.description = description;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public boolean isCloture() {
        return cloture;
    }

    public void setCloture(boolean cloture) {
        this.cloture = cloture;
    }

    public double getPrixDeVente() {
        return prixDeVente;
    }

    public void setPrixDeVente(double prixDeVente) {
        this.prixDeVente = prixDeVente;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public TypeTerrain getTypeTerrain() {
        return typeTerrain;
    }

    public void setTypeTerrain(TypeTerrain typeTerrain) {
        this.typeTerrain = typeTerrain;
    }

   

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PhotoTerrain> getPhotoTerrains() {
        return photoTerrains;
    }

    public void setPhotoTerrains(List<PhotoTerrain> photoTerrains) {
        this.photoTerrains = photoTerrains;
    }
    
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnnonce != null ? idAnnonce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnnonceTerrain)) {
            return false;
        }
        AnnonceTerrain other = (AnnonceTerrain) object;
        if ((this.idAnnonce == null && other.idAnnonce != null) || (this.idAnnonce != null && !this.idAnnonce.equals(other.idAnnonce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnnonceTerrain{" + "idAnnonce=" + idAnnonce + ", prix=" + prix + ", description=" + description + ", surface=" + surface + ", cloture=" + cloture + ", prixDeVente=" + prixDeVente + ", quartier=" + quartier + ", type=" + typeTerrain + ", user=" + user + ", photoTerrains=" + photoTerrains + '}';
    }


    
   
}
