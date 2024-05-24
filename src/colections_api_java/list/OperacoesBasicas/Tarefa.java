package colections_api_java.list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String descricao;
	
	
	public Tarefa (String descricao) {
		this.descricao = descricao;
	}
	


	public String getDescricao() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
	
	public String toString () {
		return "Tarefa {" +
	    "descricao'" + descricao + 
	    '\'' + '}';
	}

}
