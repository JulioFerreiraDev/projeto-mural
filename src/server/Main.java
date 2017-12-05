package server;

import java.io.IOException;

import core.Usuario;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Iniciando servidor");
        Servidor servidor = new Servidor();
        servidor.iniciar();  
   
    }
}