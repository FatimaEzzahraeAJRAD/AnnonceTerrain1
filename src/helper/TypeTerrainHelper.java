/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Quartier;
import bean.TypeTerrain;
import bean.Ville;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class TypeTerrainHelper extends AbstractHelper<TypeTerrain> {
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("IdType", "IdType"),
            new AbstractHelperItem("LIBELLE", "libbele")};
            
           // new AbstractHelperItem("Identifiant", "id"),};
    }

    public TypeTerrainHelper( JTable jTable, List<TypeTerrain> list) {
        super(titres, jTable, list);
    }
     public TypeTerrainHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public TypeTerrainHelper( JTable jTable) {
        super(titres, jTable);
    }
    
}
