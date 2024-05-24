package colections_api_java.list.OperacoesBasicas.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados () {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado (String nome, int codigoConvite) {
	    convidadoSet.add(new Convidado(nome, codigoConvite));
		
	}
	
	public void removerConvidadoPorCodigoConvite (int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c: convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
			
		}
		
		convidadoSet.remove(convidadoParaRemover);
		
	}
	
	public int contarConvidado() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados () {
		System.out.println(convidadoSet);
	}
	
	public static void main (String [] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados na lista");
		conjuntoConvidados.adicionarConvidado("joao", 22);
		System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados na lista");
        conjuntoConvidados.adicionarConvidado("maria", 23);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados na lista");
		conjuntoConvidados.adicionarConvidado("pedro", 23);
		System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados na lista");
		conjuntoConvidados.adicionarConvidado("jose", 24);
		System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados na lista");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(22);;
		
		conjuntoConvidados.exibirConvidados();
		
	}
}
