package colections_api_java.catalogo_livro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	//atributo 
	private List<Livro> livroList;
	
	public CatalogoLivros () {
		this.livroList = new ArrayList<>();
		
	}
	
	
	public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
		
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			
			for (Livro l: livroList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			
			
			
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorintervaloAnos = new ArrayList<>();
		
		if (!livroList.isEmpty()) {
			for (Livro l: livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorintervaloAnos.add(l);
				}
			}
		}
		return livrosPorintervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if (!livroList.isEmpty()) {
			for (Livro l: livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
	}
	
	public static void main (String [] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro1", "autor1", 2004);
		catalogoLivros.adicionarLivro("Livro2", "autor2", 2003);
		catalogoLivros.adicionarLivro("Livro3", "autor2", 1991);
		catalogoLivros.adicionarLivro("Livro4", "autor4", 1998);
		catalogoLivros.adicionarLivro("Livro5", "autor5", 2002);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
		
	}

}
