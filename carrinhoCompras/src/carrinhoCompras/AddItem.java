package carrinhoCompras;

public class AddItem {

    public static void adicionaItem(CarrinhoCompras carrinho, Item i){
        for(Item j : carrinho.carrinho){
            if (j.Produto == i.Produto){
                j.Quantidade += i.Quantidade;
                j.TotalPorItem += (i.Quantidade * i.PrecoUnitario);
                System.out.println("Item "+j.Produto+" ja existia, foi apenas adicionada a qtd "+i.Quantidade+", totalizando "+j.Quantidade+".");
                System.out.println("Item "+j.Produto+" ja existia, foi apenas adicionado o valor ao total "+(i.Quantidade * i.PrecoUnitario)+", totalizando "+j.TotalPorItem+".");
                return;
            }
        }
        carrinho.carrinho.add(i);
        return;
    }
    
}
