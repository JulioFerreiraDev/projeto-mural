package core;

import java.util.ArrayList;
import java.util.List;

public class Mural
{
	private String nome;
	private String descricao;
	private List<Post> posts;

	
	
	public Mural(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.posts = new ArrayList<>();
	}

	public void postar(Post post){
		this.posts.add(post);
	}

	public void listarPosts(List<Post> Post){
		for(Post post: this.posts){
			System.out.println(post);
		}
	}

	public void remover(Post post){
		//TODO
	}

}
