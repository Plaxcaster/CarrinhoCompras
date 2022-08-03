package carrinhoCompras;

public class Ordenar {

    public static void ordenaCarrinho (CarrinhoCompras carrinho, TipoOrdenacao tipo) {
    	switch (tipo) {
		case PRECOUNITARIO: {
			carrinho.carrinho.sort( (i1, i2) -> Double.compare(i1.getPrecoUnitario(), i2.getPrecoUnitario()));
			break;
		}
		case PRODUTO: {
			carrinho.carrinho.sort( (i1, i2) -> i1.getProduto().compareTo(i2.getProduto()));
			break;
		}
		case QUANTIDADE: {
			carrinho.carrinho.sort( (i1, i2) -> Integer.compare(i1.getQuantidade(), i2.getQuantidade()));
			break;
		}
		case TOTALPORITEM: {
		    carrinho.carrinho.sort( (i1, i2) -> Double.compare(i1.getTotalPorItem(), i2.getTotalPorItem()));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
    }
    
}
