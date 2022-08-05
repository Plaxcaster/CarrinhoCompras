package carrinhoCompras;

import java.util.Collection;
import java.util.Comparator;

import dao.BaseDao;

public class ChamaClienteDao {

    private final BaseDao<Cliente, String> clienteDao;

    public ChamaClienteDao(final BaseDao<Cliente, String> clienteDao) {
        this.clienteDao = clienteDao;
    }

    public Collection<Cliente> disponiveis(Comparator<Cliente> comparator) {
        return clienteDao.buscarTodos(comparator);
    }

    public Cliente buscaPorId(int id) {
        return clienteDao.buscaPorId(id);
    }

    public Cliente incluirVeiculo(Cliente cliente) {
        return clienteDao.salvar(cliente);
    }
    
}