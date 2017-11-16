package core;

import java.util.List;

public class Usuario
{
	private String nome;
	private String email;
	private List<Sugestao> sugeridos;
	private List<Evento> eventosConfirmados;
	private List<Lembrete> lembretes;
	private List<Post> postsSalvos;

	public Usuario(String nome, String email){
		this.nome = nome;
		this.email = email;
	}
	
	
	
	public List<Sugestao> getSugeridos(Usuario usuario) {
		return usuario.sugeridos;
	}



	public void setSugestao(Sugestao sugestao) {
		this.sugeridos.add(sugestao);
	}



	public List<Evento> getEventosConfirmados(Usuario usuario) {
		return usuario.eventosConfirmados;
	}



	public void setEventosConfirmados(Evento evento) {
		this.eventosConfirmados.add(evento);
	}



	public List<Lembrete> getLembretes(Usuario usuario) {
		return usuario.lembretes;
	}



	public void setLembrete(Lembrete lembrete) {
		this.lembretes.add(lembrete);
	}



	public List<Post> getPostsSalvos(Usuario usuario) {
		return usuario.postsSalvos;
	}



	public void setPostsSalvos(Post post) {
		this.postsSalvos.add(post);
	}



	public void lembrar(Lembrete lembrete, int n){
		//TODO
	}
	
}
