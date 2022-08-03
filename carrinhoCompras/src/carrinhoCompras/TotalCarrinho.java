package carrinhoCompras;

public class TotalCarrinho {

    public static void calcularTotal(CarrinhoCompras carrinho){
    	double valorTotal = 0.0;
    	double descontoTotal = 0.0;
        for(Item i : carrinho.carrinho){
        	valorTotal += i.TotalPorItem;
        	descontoTotal += i.TotalDesconto;
        }
        System.out.println("Carrinho [Valor total = R$"+valorTotal+
        		", Desconto total = R$"+descontoTotal+
        		", Valor total após desconto = R$"+(valorTotal-descontoTotal)+"]");
    }
    
}
