package colections_api_java.map;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
public class AgendaEventos {

	
	private Map<LocalDate, Evento> eventoMap;
	
	public AgendaEventos () {
		this.eventoMap = new HashMap<>();
	}
	
	public void AdicionarEvento (LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
		
	}
	
	public void exibirAgenda () {
		//treeMap order os elementos
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventoMap);
	}
	public void obterProximoEvento() {
	    /*
	     * Set<LocalDate> dateSet = eventoMap.keySet();
	     * Collection<Evento> values = evento.Map.values();
	     */
		//não vai funcionar porque eu não sei qual é a chave?
		//eventoMap.get(eventoMap);
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
				break;
			}
		}
	    
	}
	
	public static void main (String [] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.obterProximoEvento();
		agendaEventos.AdicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento1", "Atracao1");
		agendaEventos.AdicionarEvento(LocalDate.of(2022, Month.JULY, 23), "Evento2", "Atracao2");
		agendaEventos.AdicionarEvento(LocalDate.of(2022, Month.JULY, 28), "Evento3", "Atracao3");
		agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.MAY, 24), "Evento4", "Atracao4");
		agendaEventos.AdicionarEvento(LocalDate.of(2024, Month.JULY, 30), "Evento4", "Atracao4");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
	}
	
	
	

}
