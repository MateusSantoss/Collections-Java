package colections_api_java.list.OperacoesBasicas.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	//atributos
	private Set<Contato> contatoSet;
	
	public AgendaContatos () {
		contatoSet = new HashSet<>();
	}
	
	public void adicionarContato (String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
		
	}
	
	public void exibirContato () {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for (Contato contato: contatoSet) {
			if (contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		
		return contatosPorNome;
		
		
	}
	
	public Contato atualizarNumeroContato (String nome, int numero) {
		Contato contatoAtualizado = null;
		
		for (Contato c: contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		
		
		agendaContatos.adicionarContato("Camila", 759921109);
		agendaContatos.adicionarContato("Camila2", 759929);
		agendaContatos.adicionarContato("Camila3", 7521109);
		agendaContatos.adicionarContato("Paula", 759933252);
		
		agendaContatos.exibirContato();
		System.out.println(agendaContatos.pesquisarPorNome("Camila"));
		
		
		System.out.println("Você atualizou um contato " +  agendaContatos.atualizarNumeroContato("Paula", 7123423));
		agendaContatos.exibirContato();
		
	}
	
	

}
