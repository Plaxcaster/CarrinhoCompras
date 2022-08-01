
package carrinhoCompras;

public class Main {

    public static void main(String[] args) {
        
        Item itemTeste1 = new Item("Maca", TipoProduto.Hortifruti, 5, 0.50);
        Item itemTeste2 = new Item("Banana", TipoProduto.Hortifruti, 5, 0.30);
        Item itemTeste3 = new Item("Morango", TipoProduto.Hortifruti, 5, 1.00);
        Item itemTeste4 = new Item("Morango", TipoProduto.Hortifruti, 5, 1.00);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(itemTeste1);
        carrinho.adicionaItem(itemTeste2);
        carrinho.adicionaItem(itemTeste3);
        carrinho.adicionaItem(itemTeste4);
        
        System.out.println();
        System.out.println("Carrinho pos-adicao:");
        carrinho.listaCarrinho();

        System.out.println();
        System.out.println("Carrinho pos-ordenacao:");
        carrinho.ordenaCarrinho(TipoOrdenacao.QUANTIDADE);
        carrinho.listaCarrinho();

        carrinho.removeItem(itemTeste2);

        System.out.println();
        System.out.println("Carrinho pos-exclusao:");
        carrinho.listaCarrinho();

    }
    
}
