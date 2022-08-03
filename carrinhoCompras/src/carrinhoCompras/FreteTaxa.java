package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class FreteTaxa{

    public static void freteItem (CarrinhoCompras carrinho, TipoProd i, double porcentagem){
        
        for(Item j: carrinho.carrinho){
            if(j.tipoProduto == i){
                j.TotalPorItem = j.TotalPorItem*(1+porcentagem);
                return;
            }
        }

    }
    
}