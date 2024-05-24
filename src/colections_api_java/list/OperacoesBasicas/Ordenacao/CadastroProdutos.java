package colections_api_java.list.OperacoesBasicas.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class CadastroProdutos {
	
	//atributo
	
	private Set<Produto> produtoSet;
	
	public CadastroProdutos () {
		produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto (long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome,cod,preco,quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome () {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirPorPreco () {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		
		return produtosPorPreco;
		
	}
	
	public static void main (String [] args ) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos ();
		
		cadastroProdutos.adicionarProduto(2213, "Picanha", 109.10, 2);
		cadastroProdutos.adicionarProduto(4523, "Feijão", 2.75, 4);
		cadastroProdutos.adicionarProduto(4553, "Arroz", 3.90, 1);
		
		System.out.println(cadastroProdutos.exibirProdutosPorNome() + "\n");
		System.out.println(cadastroProdutos.exibirPorPreco());
		
		
		
	}

}
