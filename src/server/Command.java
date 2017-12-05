/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 * Command interface definition
 * @author helio
 */
public enum Command {
    
    CREATE_USER("criar-usuario"),
    CREATE_MURAL("criar-mural"),
    
    POST_MESSAGE("postar-mensagem"),
    POST_ANUNCIO("postar-anuncio"),
    LIST_USER_MESSAGES("listar-mensagens-usuario"),
    
    FOLLOW("seguir"),
    LIST_FOLLOWERS("listar-seguidores"),
    LIST_FOLLOWING("listar-seguidos"),
    LIST_FOLLOWING_MESSAGES("listar-mensagens-seguidos"),
    UNFOLLOW("deixar-de-seguir"),
    
    LIST_STATISTICS("listar-estatisticas-usuario"),
    
    LIST_TREND_TOPICS("listar-tendencia"),
    LIST_MESSAGES_WITH_HASHTAG("listar-mensagens-com-palavra-marcada"), 
    RESET("resetar");
    
    
    private String label;
    
    private Command(String label){
        this.label = label;
    }
    
    @Override
    public String toString(){
        return label;
    }
    
}
