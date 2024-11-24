/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luisg
 */
public class Autentificacion {
    String adminuser;
    String adminpass;

    public Autentificacion() {
        this.adminuser="admin";
        this.adminpass="admin";
    }
    
    
    public boolean Login(String user, String password){
        
        boolean login = false;
        
        if(user.equals(adminuser) && password.equals(adminpass)){
            login=true;
        }
        
        return login;
    }
    
}
