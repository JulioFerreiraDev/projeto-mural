/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author helio
 */
public enum OutputMessage {
    
    SUCCESS("ok"),
    INVALID_COMMAND("comando-invalido"), 
    USER_ALREADY_EXISTS("usuario-ja-existe"),
    USER_DOESNT_EXIST("usuario-nao-encontrado"),
    FOLLOWER_DOESNT_EXIST("seguidor-nao-encontrado"),
    FOLLOWED_DOESNT_EXIST("seguido-nao-encontrado"),
    INVALID_NAME("nome-invalido"),
    INVALID_MESSAGE("mensagem-invalida"), 
    HASHTAG_DOESNT_EXIST("Error: The hashtag does not exist!"), 
    USER_IS_NOT_FOLLOWED("nao-seguindo"),
    USER_IS_ALREADY_FOLLOWED("ja-seguindo"), 
    SAME_USER("seguidor-e-seguido-sao-iguais");
    
    
    private String label;
    
    private OutputMessage(String label){
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
    
}
