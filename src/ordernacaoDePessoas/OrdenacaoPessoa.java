package ordernacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	private List<Pessoa> listaPessoa;
	
	
	public OrdenacaoPessoa () {
		listaPessoa = new ArrayList<>();
		
	}
	
	
	public  void adicionarPessoa(String nome, int idade, double altura) {
	    listaPessoa.add(new Pessoa(nome, idade, altura));
		
	}
	
	public List<Pessoa> ordenarPorIdade () {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoa);
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura () {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		
		return pessoasPorAltura;
		
	}
	
	
	
	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("nome3", 20, 1.57);
		ordenacaoPessoa.adicionarPessoa("nome2", 22, 1.82);
		ordenacaoPessoa.adicionarPessoa("nome1", 18, 1.57);
		ordenacaoPessoa.adicionarPessoa("nome1", 18, 1.57);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
		
	}
	
	
	
	

}
