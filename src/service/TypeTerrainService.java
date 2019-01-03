/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.TypeTerrain;

/**
 *
 * @author Jawadoo
 */
public class TypeTerrainService extends AbstractFacade<TypeTerrain>{
    
    public TypeTerrain createTypeTerrain(String libelle){
        TypeTerrain typeTerrain = new TypeTerrain();
        typeTerrain.setLibbele(libelle);
        create(typeTerrain);
        return typeTerrain;
    }
    
    public TypeTerrainService() {
        super(TypeTerrain.class);
    }
    
}
