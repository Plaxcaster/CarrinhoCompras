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
    
    public void ordenaCarrinho (TipoOrdenacao tipo) {
    	switch (tipo) {
		case PRECOUNITARIO: {
			carrinho.sort( (i1, i2) -> Double.compare(i1.getPrecoUnitario(), i2.getPrecoUnitario()));
			break;
		}
		case PRODUTO: {
			carrinho.sort( (i1, i2) -> i1.getProduto().compareTo(i2.getProduto()));
			break;
		}
		case QUANTIDADE: {
			carrinho.sort( (i1, i2) -> Integer.compare(i1.getQuantidade(), i2.getQuantidade()));
			break;
		}
		case TOTALPORITEM: {
			carrinho.sort( (i1, i2) -> Double.compare(i1.getTotalPorItem(), i2.getTotalPorItem()));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
    }
    
    public void calcularTotal(){
    	double valorTotal = 0.0;
    	double descontoTotal = 0.0;
        for(Item i : carrinho){
        	valorTotal += i.TotalPorItem;
        	descontoTotal += i.TotalDesconto;
        }
        System.out.println("Carrinho [Valor total = R$"+valorTotal+
        		", Desconto total = R$"+descontoTotal+
        		", Valor total após desconto = R$"+(valorTotal-descontoTotal)+"]");
    }

 	
}
