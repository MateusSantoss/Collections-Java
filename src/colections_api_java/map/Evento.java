package colections_api_java.map;

public class Evento {
	private String nome;
	
	private String atracao;
	
	public Evento (String nome, String atracao) {
		this.nome = nome;
		this.atracao = atracao;
		
	}
	
	
	public String getNome () {
		return nome;
	}
	
	public void setNome () {
		this.nome = nome;
	}
	
	public String getAtracao() {
		return this.atracao;
	}
	
	public void setAtracao () {
		this.atracao = atracao;
	}


	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}
	
	

}
