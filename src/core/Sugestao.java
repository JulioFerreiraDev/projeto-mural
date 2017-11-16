package core;

import java.util.List;

public class Sugestao
{
	private Post post;
	private List<Post> postsSalvos;
	private Usuario sugestor;
	
	public Sugestao(Post post, Usuario sugestor) {
		this.post = post;
		this.sugestor = sugestor;
		this.postsSalvos.add(post);
	}
	
	
}


