package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {
    
    private static final int PORTA = 1234;
    private PersistentDatabase database;
    
    public void iniciar() throws IOException {
        ServerSocket socket = new ServerSocket(PORTA);
        database = new PersistentDatabase();

        try {
            while (true) {
                atenderCliente(socket.accept());
            }
        } finally {
            socket.close();
        }
    }
    
    private void atenderCliente(final Socket cliente) {        
        // A ideia basica para atender um cliente é
        //   - ler comando
        //   - processar comando
        //   - escrever resposta
        
        new Thread() {

            @Override
            public void run() {
                
                ArrayList<String> out_list; //Lista de retorno
        
                String command = null;
                
                try {
                    command = readLine(cliente.getInputStream());
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }

                out_list = handleCommand(command); 
                
                try {
                    for (String line: out_list){
                        writeLine(cliente.getOutputStream(), line);
                    }
                    
                    cliente.close();
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        }.start(); 
    }
    
    private static String readLine(InputStream in) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        return reader.readLine();
    }
    
    private static void writeLine(OutputStream out, String linhas) throws IOException {
        out.write(linhas.getBytes());
        out.write('\n');
    }


    private ArrayList<String> handleCommand(String command){
        
        ArrayList<String> out_list = new ArrayList<String>();
        if (command == null){
            out_list.add(OutputMessage.INVALID_COMMAND.toString());
            return out_list;
        }
        String command_type = command.split(" ")[0];
        
        if (command_type.equals(Command.CREATE_USER.toString())){
            //TODO
        }    
        //TODO...
        
        return out_list;

    }

 
    
}