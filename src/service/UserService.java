/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;

/**
 *
 * @author Jawadoo
 */
public class UserService extends AbstractFacade<User>{
    
    public UserService() {
        super(User.class);
    }

   
      public int seConnecter(String login, String password) {
        User user = find(login);
             if (user == null) {
                    return -1;
              } 
               else if (user.isBloque()==true) {
                   return -2;
                } 
               else {
                    return 1;
                }    
        }         
}
