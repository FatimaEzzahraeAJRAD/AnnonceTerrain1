/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
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
    private String refAnnonce ;
    private double prix ;
     private String description ;
    private double surface;
    private boolean cloture;
    //private  Date date;
    private double prixDeVente ;
    @ManyToOne
    public  Quartier  quartier;
    @ManyToOne
    private  TypeTerrain typeTerrain;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "annonceTerrain")
    private List<PhotoTerrain> photoTerrains;

   

    public AnnonceTerrain(String refAnnonce, double prix, String description, double surface, boolean cloture, double prixDeVente, Quartier quartier, TypeTerrain type, User user, List<PhotoTerrain> photoTerrains) {
        this.refAnnonce = refAnnonce;
        this.prix = prix;
        this.description = description;
        this.surface = surface;
        this.cloture = cloture;
        this.prixDeVente = prixDeVente;
        this.quartier = quartier;
        this.typeTerrain = typeTerrain;
        this.user = user;
        this.photoTerrains = photoTerrains;
        //this.date=date;
    }

    public AnnonceTerrain() {
    }

    public AnnonceTerrain(String refAnnonce) {
        this.refAnnonce = refAnnonce;
    }


   
    public String getRefAnnonce() {
        return refAnnonce;
    }

    public void setRefAnnonce(String refAnnonce) {
        this.refAnnonce = refAnnonce;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
        if(quartier==null){
             quartier= new Quartier();
        }
        return quartier;
    }

    public void setQuartier(Quartier quartier) {
        this.quartier = quartier;
    }

    public TypeTerrain getTypeTerrain() {
        if(typeTerrain==null){
            typeTerrain= new TypeTerrain();
        }
        return typeTerrain;
    }

    public void setTypeTerrain(TypeTerrain typeTerrain) {
        this.typeTerrain = typeTerrain;
    }

   

    public User getUser() {
        if(user==null){
            user= new User();
        }
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

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//    
  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refAnnonce != null ? refAnnonce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnnonceTerrain)) {
            return false;
        }
        AnnonceTerrain other = (AnnonceTerrain) object;
        if ((this.refAnnonce == null && other.refAnnonce != null) || (this.refAnnonce != null && !this.refAnnonce.equals(other.refAnnonce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnnonceTerrain{" + "idAnnonce=" + refAnnonce + ", prix=" + prix + ", description=" + description + ", surface=" + surface + ", cloture=" + cloture + ", prixDeVente=" + prixDeVente + ", quartier=" + quartier + ", type=" + typeTerrain + ", user=" + user + ", photoTerrains=" + photoTerrains + '}';
    }


    
   
}
