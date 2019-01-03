/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.AnnonceTerrain;
import bean.Quartier;
import bean.Ville;

/**
 *
 * @author Jawadoo
 */
public class QuartierService  extends AbstractFacade<Quartier>{
    
    public QuartierService() {
        super(Quartier.class);
    }
    
      public Quartier creeQuartier( String nom , Ville ville) {
        Quartier quartier =new Quartier();
        quartier.setNom(nom);
        quartier.setVille(ville);
        create(quartier);
        return quartier;
    }
}
