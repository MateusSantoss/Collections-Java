package colections_api_java.list.OperacoesBasicas.pesquisa;

import java.util.Objects;

public class Contato {
	private String nome;
	
	private int numero;
	
	public Contato (String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		
	}
	
	
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNumero (int numero) {
		this.numero = numero;
		
	}
	
	public int getNumero () {
		return this.numero;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}


	@Override
	public String toString() {
		return "[nome=" + nome + ", numero=" + numero + "]\n";
	}
	
	
	
	

}
