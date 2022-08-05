package carrinhoCompras;

import java.util.Collection;
import java.util.Comparator;

import dao.BaseDao;


public class ChamaCarrinhoDao {

    private final BaseDao<CarrinhoCompras, String> veiculoDao;

    public ChamaCarrinhoDao(final BaseDao<CarrinhoCompras, String> veiculoDao) {
        this.veiculoDao = veiculoDao;
    }

    public Collection<CarrinhoCompras> disponiveis(Comparator<CarrinhoCompras> comparator) {
        return veiculoDao.buscarTodos(comparator);
    }

    public CarrinhoCompras buscaPorId(int id) {
        return veiculoDao.buscaPorId(id);
    }

    public CarrinhoCompras incluirVeiculo(CarrinhoCompras veiculo) {
        return veiculoDao.salvar(veiculo);
    }
    
}
