/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author helio
 */
class InMemoryDatabase {
        
   //metodos de CRUD no banco de dados
    Map<String, Usuario> usuarios = new HashMap<String, Usuario>();
    Map<Integer, Post> posts = new HashMap();
    Map<String, Mural> murais = new HashMap();
    
    public void inserirUsuario(Usuario usuario){
        usuarios.put(usuario.getUserName(), usuario);
    }
    
    public Usuario getUsuario(String userName){
        usuarios.get(userName);
    }
    
    
}
