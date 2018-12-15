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
import javax.persistence.OneToMany;

/**
 *
 * @author Jawadoo
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String login;
    private String password;
    private boolean bloque;
 private int nombreCnxRestant;

    public User(boolean bloque, int nombreCnxRestant) {
        this.bloque = bloque;
        this.nombreCnxRestant = nombreCnxRestant;
    }

   
    public User() {
    }

    public User(String identifiant, String password) {
        this.login = identifiant;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isBloque() {
        return bloque;
    }

    public void setBloque(boolean bloque) {
        this.bloque = bloque;
    }

   

    public int getNombreCnxRestant() {
        return nombreCnxRestant;
    }

    public void setNombreCnxRestant(int nombreCnxRestant) {
        this.nombreCnxRestant = nombreCnxRestant;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", bloque=" + bloque + ", nombreCnxRestant=" + nombreCnxRestant + '}';
    }

   
}
