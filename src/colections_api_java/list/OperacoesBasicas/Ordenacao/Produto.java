package colections_api_java.list.OperacoesBasicas.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private String nome;
	private long codigo;
	private double preco;
	private int quantidade;
	
	
	public Produto (String nome, long codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
		
		
		
	}
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}

	
	public String getNome () {
		return this.nome;
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
		
	}
	
	public long getCodigo () {
		return this.codigo;
	}
	
	public void setCodio (long codigo) {
		this.codigo = codigo;
	}
	
	public int getQuantidade () {
		return this.quantidade;
	}
	
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco () {
		return this.preco;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	

		
	

}
