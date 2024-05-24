package colections_api_java.map;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos () {
		estoqueProdutosMap = new HashMap<>();
	}
	
	
	public void adicionarProduto (long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
		
	}
	
	public double calcularValorTotalEstoque () {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for (Produto p: estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		
		return valorTotalEstoque;
	}
	
	
	public double obterValorProdutoMaiscaro () {
		double produtoMaisCaro = 0d;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for (Produto p: estoqueProdutosMap.values()) {
				produtoMaisCaro = p.getPreco();
				if (produtoMaisCaro < p.getPreco()) {
					produtoMaisCaro = p.getPreco();
				}
			}
			
		}
		
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisCaro () {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		
		if (!estoqueProdutosMap.isEmpty()) {
			for(Produto p: estoqueProdutosMap.values()) {
				if(p.getPreco() > maiorPreco) {
					maiorPreco = p.getPreco();
					produtoMaisCaro = p;
				
					
				}
				
			}
			
			
		}
		
		return produtoMaisCaro;
		
	}
	
	
	
	public void exibirProdutos () {
		System.out.println(estoqueProdutosMap);
	}
	
	public static void main (String [] args) {
		 EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

	     
	
	     
	     estoqueProdutos.adicionarProduto(2234L, "Picanha", 255, 1);
	     estoqueProdutos.adicionarProduto(22234L, "Café", 10, 1);
	     estoqueProdutos.adicionarProduto(2342L, "Feijão", 2.90, 10);
	     estoqueProdutos.adicionarProduto(33L, "Vinho", 1450.00, 1);
	     System.out.println("O valor total no estoque é de: " + estoqueProdutos.calcularValorTotalEstoque());
	     System.out.println("Esse é o produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
	     estoqueProdutos.exibirProdutos();
	     
	    
	     
	  
	     
	     
		
	}
	
	
	

}
