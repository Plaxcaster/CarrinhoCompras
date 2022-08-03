package carrinhoCompras;

public class TaxaExtra extends TipoProduto{

    public static void taxaExtra(CarrinhoCompras carrinho, TipoProd tipo, double taxa){
        
        for(Item j: carrinho.carrinho){
            if(j.tipoProduto == tipo){
                j.TotalPorItem = j.TotalPorItem*(1+taxa);
            }
        }
        
    }
    
}
