package colections_api_java.catalogo_livro;

public class Livro {
	
	///atributos
	private String titulo;
	
	private String autor;
	private int anoPublicacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public Livro(String titulo, String autor, int anoPublicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + ", getTitulo()="
				+ getTitulo() + ", getAutor()=" + getAutor() + ", getAnoPublicacao()=" + getAnoPublicacao()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}
