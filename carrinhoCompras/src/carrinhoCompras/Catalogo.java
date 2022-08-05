package carrinhoCompras;

import java.util.ArrayList;

public class Catalogo {
	
	private ArrayList<Item> estoque;
	public Catalogo() {
		estoque = new ArrayList<>() ;
		Item itemTeste1 = new Item("Maca", TipoProduto.TipoProd.Hortifruti, 5, 0.50);
        Item itemTeste2 = new Item("Banana", TipoProduto.TipoProd.Hortifruti, 5, 0.30);
        Item itemTeste3 = new Item("Morango", TipoProduto.TipoProd.Hortifruti, 5, 1.00);
        Item itemTeste4 = new Item("Morango", TipoProduto.TipoProd.Hortifruti, 5, 1.00);
        Item itemTeste5 = new Item("Picanha", TipoProduto.TipoProd.Carnes, 1, 100.00);

		estoque.add(itemTeste1);
		estoque.add(itemTeste2);
		estoque.add(itemTeste3);
		estoque.add(itemTeste4);
		estoque.add(itemTeste5);

	}
	
	public Item getItem(int id) {
	    return this.estoque.get(id-1);
	}
	
//	public Item getItem(String nomeItem) {
//
//	}
}
