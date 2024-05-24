package colections_api_java.carrinhosDeCompras;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	private List<Compra> compraList;
	
	public CarrinhoDeCompra () {
		compraList = new ArrayList<>();
	}
	public void adicionarItem(String nome, double preco, int quantidade) {
		compraList.add(new Compra(nome, preco, quantidade));
		
	}
	
	
	public void removerItem(String nome) {
		List<Compra> comprasParaRemover = new ArrayList<>();
		
		for (Compra compra: compraList) {
			if(compra.getNome().equalsIgnoreCase(nome)) {
				comprasParaRemover.add(compra);
			}
		}
		compraList.removeAll(comprasParaRemover);
		
	}
	
	public  double calcularValorTotal() {
		double valorTotal = 0;
		for (Compra compra: compraList) {
			valorTotal += compra.getPreco() * compra.getQuantidade();
		}
		
		return valorTotal;
		
	}
	

	
	public static void main (String [] args) {
	 
	   CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra () ;
	   
	   carrinhoDeCompra.adicionarItem("Picando", 56.7, 2);
	   carrinhoDeCompra.adicionarItem("P", 56.7, 2);
	   
	   
	   System.out.println(carrinhoDeCompra.calcularValorTotal());	   
	   
	   
	   
	}
	
   
}
