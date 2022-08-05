package dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CarrinhoDao<CarrinhoCompras> implements BaseDao<CarrinhoCompras, String> {

    private List<CarrinhoCompras> veiculos = new ArrayList<>();

    @Override
    public CarrinhoCompras salvar(CarrinhoCompras veiculo) {
        veiculos.add(veiculo);
        System.out.println("veiculo salvo" + veiculo);
        return veiculo;
    }

    @Override
    public List<CarrinhoCompras> buscarTodos() {
        return veiculos;
    }

    @Override
    public TreeSet<CarrinhoCompras> buscarTodos(Comparator<CarrinhoCompras> comparator) {
        final TreeSet<CarrinhoCompras> veiculosComparados = new TreeSet<CarrinhoCompras>(comparator);
        veiculosComparados.addAll(veiculos);
        return veiculosComparados;
    }

    @Override
    public void remover(CarrinhoCompras veiculo) {
        veiculos.remove(veiculo);
        System.out.println("veiculo removido" + veiculo);
    }

    @Override
    public CarrinhoCompras buscaPorId(int id) {
        return veiculos.get(id);
    }
    
}
