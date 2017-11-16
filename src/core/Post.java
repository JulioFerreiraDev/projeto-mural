package core;
import java.util.List;


public class Post
{
	private String texto;
	private List<String> imagens;
	private List<String> documentos;
	private List<Comentario> comentario;
	private List<Anuncio> anuncio;
	private List<Aviso> aviso;
	private List<Noticia> noticia;
	private List<Lembrete> lembrete;
	private List<Evento> evento;
	private List<Sugestao> sugestao;
	private List<Usuario> usuarios;

	
	public Post(String texto, String imagem, String documento,
			Comentario comentario, Anuncio anuncio,
			Aviso aviso, Noticia noticia, Lembrete lembrete,
			Evento evento, Sugestao sugestao, Usuario usuario) {
		this.texto = texto;
		this.imagens.add(imagem);
		this.documentos.add(documento);
		this.comentario.add(comentario);
		this.anuncio.add(anuncio);
		this.aviso.add(aviso);
		this.noticia.add(noticia);
		this.lembrete.add(lembrete);
		this.evento.add(evento);
		this.sugestao.add(sugestao);
		this.usuarios.add(usuario);
	}

	public void salvar(Usuario usuario){
		this.usuarios.add(usuario);
	}

	public void demonstrarInteresse(Usuario usuario){
		//TODO
	}

	public void criarLembrete(Usuario usuario, int n, Lembrete lembrete){
		//TODO
	}

	public void comentar(Usuario usuario, String texto){
		//TODO
	}

	public void sugerir(Usuario usuario1, Usuario usuario2){
		//TODO
	}

}
