package carrinhoCompras;

import carrinhoCompras.TipoProduto.TipoProd;

public class FretePct extends CarrinhoCompras{

    public static void freteItem (CarrinhoCompras carrinho, TipoProd i, double porcentagem){

        totalFret.totalAPagar(carrinho, i, porcentagem);

    }
    
}
