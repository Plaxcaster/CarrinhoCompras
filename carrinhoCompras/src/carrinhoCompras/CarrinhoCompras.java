package carrinhoCompras;

import java.util.ArrayList;

public class CarrinhoCompras {

    ArrayList<Item> carrinho = new ArrayList<>();

    public void listaCarrinho(){
        for(Item i : carrinho){
            System.out.println(i.toString());
        }
    }

    public void adicionaItem(Item i){
        for(Item j : carrinho){
            if (j.Produto == i.Produto){
                j.Quantidade += i.Quantidade;
                j.TotalPorItem += (i.Quantidade * i.PrecoUnitario);
                System.out.println("Item "+j.Produto+" ja existia, foi apenas adicionada a qtd "+i.Quantidade+", totalizando "+j.Quantidade+".");
                System.out.println("Item "+j.Produto+" ja existia, foi apenas adicionado o valor ao total "+(i.Quantidade * i.PrecoUnitario)+", totalizando "+j.TotalPorItem+".");
                return;
            }
        }
        carrinho.add(i);
        return;
    }

    public void removeItem(Item i){
        carrinho.remove(i);
    }

 	
}
