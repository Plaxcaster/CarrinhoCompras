package carrinhoCompras;

public class ImprimeCarrinho {

    public static void listaCarrinho(CarrinhoCompras carrinho){
        for(Item i : carrinho.carrinho){
            System.out.println(i.toString());
        }
    }
    
}
