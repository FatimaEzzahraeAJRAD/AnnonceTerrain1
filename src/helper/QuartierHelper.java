/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Quartier;
import bean.Ville;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author Chaimaa-abd
 */
public class QuartierHelper extends AbstractHelper<Quartier> {
    
     private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            
            new AbstractHelperItem("IdQuartier", "idQuartier"),
            new AbstractHelperItem("NOM", "nom")};
            
           // new AbstractHelperItem("Identifiant", "id"),};
    }

    public QuartierHelper( JTable jTable, List<Quartier> list) {
        super(titres, jTable, list);
    }
     public QuartierHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public QuartierHelper( JTable jTable) {
        super(titres, jTable);
    }
    
}
