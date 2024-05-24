package colections_api_java.list.OperacoesBasicas.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> listaNumeros;
	
	public OrdenacaoNumeros () {
		this.listaNumeros = new ArrayList();
	}
	
	
	public void adicionarNumero (int numero) {

		this.listaNumeros.add(numero);
	
		
	}
	
	public void ordernarNumerosAscendente () {
		Collections.sort(listaNumeros);
		
	}
	
	public void ordenarNumerosDescendente () {
		Collections.sort(listaNumeros, Collections.reverseOrder());
	}
	
	public void exibirNumeros() {
		System.out.print(listaNumeros);
		
	}



   public static void main (String [] args) {
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
		numeros.adicionarNumero(10);
		numeros.adicionarNumero(20);
		numeros.adicionarNumero(3);
		numeros.ordernarNumerosAscendente();
		numeros.exibirNumeros();
		
		

		
	}


	@Override
	public String toString() {
		return "OrdenacaoNumeros [listaNumeros=" + listaNumeros + "]";
	}
	
	
	
	
	
	
	

}
