package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class totalFret {

    public static double totalAPagar(CarrinhoCompras carrinho, TipoProd i, double porcentagem){

        for(Item j: carrinho.carrinho){
            if(j.tipoProduto == i){
                j.TotalPorItem = (j.Quantidade*((1+porcentagem)*j.PrecoUnitario));
            }
        }
        double totalValor = 0;

        for(Item k: carrinho.carrinho){
            totalValor += k.TotalPorItem;
        }

        return totalValor;
    }
    
}
