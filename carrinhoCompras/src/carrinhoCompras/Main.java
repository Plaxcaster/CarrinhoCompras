
package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class Main {

    public static void main(String[] args) {
        
    	Catalogo catalogo = new Catalogo(); //Inicializa os itens que podem ser adicionados no carrinho

        CarrinhoCompras carrinho = new CarrinhoCompras();

        AddItem.adicionaItem(carrinho, catalogo.getItem(1));
        AddItem.adicionaItem(carrinho, catalogo.getItem(2));
        AddItem.adicionaItem(carrinho, catalogo.getItem(3));
        AddItem.adicionaItem(carrinho, catalogo.getItem(4));
        AddItem.adicionaItem(carrinho, catalogo.getItem(5));

        
        System.out.println();
        System.out.println("Carrinho pos-adicao:");
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        System.out.println();
        System.out.println("Carrinho pos-ordenacao:");
        Ordenar.ordenaCarrinho(carrinho, TipoOrdenacao.QUANTIDADE);
        ImprimeCarrinho.listaCarrinho(carrinho);
        TotalCarrinho.calcularTotal(carrinho);
        
        RemoveItem.removeItem(carrinho, catalogo.getItem(1));
        
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

