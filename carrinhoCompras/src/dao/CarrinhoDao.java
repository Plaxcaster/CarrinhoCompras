package dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CarrinhoDao<CarrinhoCompras> implements BaseDao<CarrinhoCompras, String> {

    private List<CarrinhoCompras> carrinhos = new ArrayList<>();

    @Override
    public CarrinhoCompras salvar(CarrinhoCompras carrinho) {
        carrinhos.add(carrinho);
        System.out.println("Carrinho salvo \n" + carrinho);
        return carrinho;
    }

    @Override
    public List<CarrinhoCompras> buscarTodos() {
        return carrinhos;
    }

    @Override
    public TreeSet<CarrinhoCompras> buscarTodos(Comparator<CarrinhoCompras> comparator) {
        final TreeSet<CarrinhoCompras> veiculosComparados = new TreeSet<CarrinhoCompras>(comparator);
        veiculosComparados.addAll(carrinhos);
        return veiculosComparados;
    }

    @Override
    public void remover(CarrinhoCompras carrinho) {
        carrinhos.remove(carrinho);
        System.out.println("carrinho removido" + carrinho);
    }

    @Override
    public CarrinhoCompras buscaPorId(int id) {
        return carrinhos.get(id);
    }
    
}
