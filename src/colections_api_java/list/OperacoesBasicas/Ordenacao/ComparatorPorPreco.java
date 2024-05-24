package colections_api_java.list.OperacoesBasicas.Ordenacao;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}