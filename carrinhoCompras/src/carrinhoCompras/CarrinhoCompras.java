package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    public Cliente cliente;
    public List<Item> carrinho = new ArrayList<>();

    public void carrinhoCompras(Cliente cliente, List<Item> carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Item> carrinho) {
        this.carrinho = carrinho;
    }
 	
}
