package carrinhoCompras;

public class AlteraQtdItem {

    public static void alterarQtdItem(CarrinhoCompras carrinho, Item i, int qtd, String tipo){
        if(tipo == "Adicionar"){
            for(Item j: carrinho.carrinho){
                if(j.Produto == i.Produto){
                    j.Quantidade += qtd;
                    j.TotalPorItem = (j.Quantidade*j.PrecoUnitario);
                    System.out.println(j.TotalPorItem);
                    return;
                }
            }
        }
        else if(tipo == "Remover"){
            for(Item j: carrinho.carrinho){
                if((j.Produto == i.Produto) && (j.Quantidade > qtd)){
                    j.Quantidade -= qtd;
                    j.TotalPorItem = (j.Quantidade*j.PrecoUnitario);
                    System.out.println(j.TotalPorItem);
                    return;
                }
            }
        }

    }
    
}
