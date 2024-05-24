package colections_api_java.list.OperacoesBasicas.set;

import java.util.Objects;

public class Convidado {
   //atributos
	
	private String nome;
	
	private int codigoConvite;
	
	public Convidado (String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void SetCodigoConvite (int codigoConvite) {
		this.codigoConvite = codigoConvite;
		
	}
	
	public int getCodigoConvite () {
		return this.codigoConvite;
	}


	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}
	
	
	
	
	
	
	
}
