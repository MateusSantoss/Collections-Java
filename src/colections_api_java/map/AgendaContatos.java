package colections_api_java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos () {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
		
	}
	
	public void removerContato (String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
		
	}
	
	public void exibirContato () {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome (String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
			
		}
		
		return numeroPorNome;
		
	}
	
	
	
	public static void main  (String [] agrs) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.exibirContato();
		agendaContatos.adicionarContato("Tiago", 22345);
		agendaContatos.adicionarContato("João", 23412);
		agendaContatos.adicionarContato("Camila", 22347);
		agendaContatos.adicionarContato("Camila", 223407);
		agendaContatos.removerContato("João");
		agendaContatos.exibirContato();
		
		
	}

}
