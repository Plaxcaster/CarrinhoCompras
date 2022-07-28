
package carrinhoCompras;

public class Main {

    public static void main(String[] args) {
        
        Item itemTeste1 = new Item("Maçã", 5, 0.50);
        Item itemTeste2 = new Item("Banana", 5, 0.30);
        Item itemTeste3 = new Item("Morango", 5, 0.50);
        Item itemTeste4 = new Item("Morango", 5, 0.50);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(itemTeste1);
        carrinho.adicionaItem(itemTeste2);
        carrinho.adicionaItem(itemTeste3);
        carrinho.adicionaItem(itemTeste4);

        System.out.println("Carrinho pos-adicao:");
        carrinho.listaCarrinho();

        carrinho.removeItem(itemTeste2);

        System.out.println("Carrinho pos-exclusao:");
        carrinho.listaCarrinho();

    }
    
}
