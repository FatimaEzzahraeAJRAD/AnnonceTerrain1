/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.AnnonceTerrain;
import bean.Quartier;
import bean.TypeTerrain;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class AnnonceTerrainHelper extends AbstractHelper<AnnonceTerrain> {
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("REFANNONCE  ", "refAnnonce"),
            new AbstractHelperItem("SURFACE", "surface"),
            new AbstractHelperItem("PRIX", "prix"),
           new AbstractHelperItem("QUARTIER", "quartier"),
            new AbstractHelperItem("TYPETERRAIN", "typeTerrain")};
            
           // new AbstractHelperItem("Identifiant", "id"),};
    }

    public AnnonceTerrainHelper( JTable jTable, List<AnnonceTerrain> list) {
        super(titres, jTable, list);
    }
     public AnnonceTerrainHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public AnnonceTerrainHelper( JTable jTable) {
        super(titres, jTable);
    }
    
}
