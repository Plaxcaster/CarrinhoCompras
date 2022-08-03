
package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class Main {

    public static void main(String[] args) {
        
        Item itemTeste1 = new Item("Maca", TipoProduto.TipoProd.Hortifruti, 5, 0.50);
        Item itemTeste2 = new Item("Banana", TipoProduto.TipoProd.Hortifruti, 5, 0.30);
        Item itemTeste3 = new Item("Morango", TipoProduto.TipoProd.Hortifruti, 5, 1.00);
        Item itemTeste4 = new Item("Morango", TipoProduto.TipoProd.Hortifruti, 5, 1.00);
        Item itemTeste5 = new Item("Picanha", TipoProduto.TipoProd.Carnes, 1, 100.00);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        AddItem.adicionaItem(carrinho, itemTeste1);
        AddItem.adicionaItem(carrinho, itemTeste2);
        AddItem.adicionaItem(carrinho, itemTeste3);
        AddItem.adicionaItem(carrinho, itemTeste4);
        AddItem.adicionaItem(carrinho, itemTeste5);
        
        System.out.println();
        System.out.println("Carrinho pos-adicao:");
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        System.out.println();
        System.out.println("Carrinho pos-ordenacao:");
        Ordenar.ordenaCarrinho(carrinho, TipoOrdenacao.QUANTIDADE);
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        RemoveItem.removeItem(carrinho, itemTeste2);
        
        System.out.println();
        System.out.println("Carrinho pos-exclusao:");
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);

        System.out.println();
        System.out.println("Item removido:");
        AlteraQtdItem.alterarQtdItem(carrinho, carrinho.carrinho.get(1), 2,"Remover");
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        System.out.println("Item adicionado:");
        AlteraQtdItem.alterarQtdItem(carrinho, carrinho.carrinho.get(1), 20,"Adicionar");
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        System.out.println("Taxa extra no item hortifruti:");
        TipoProduto.TipoProd hortifruti = TipoProd.Hortifruti;
        TaxaExtra.taxaExtra(carrinho, hortifruti, 0.15);
        ImprimeCarrinho.listaCarrinho(carrinho);

        System.out.println();
        TipoProduto.TipoProd carne = TipoProd.Carnes;
        FretePct.freteItem(carrinho, carne, 0.50);
        ImprimeCarrinho.listaCarrinho(carrinho);

    }
    
}

