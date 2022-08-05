package dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import carrinhoCompras.Cliente;

public class ClienteDao implements BaseDao<Cliente, String> {
    private static List<Cliente> clientes = new ArrayList<>();

    @Override
    public Cliente salvar(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente salvo" + cliente);
        return cliente;
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clientes;
    }

    @Override
    public List<Cliente> buscarTodos(Comparator<Cliente> comparator) {
        return null;
    }

    @Override
    public void remover(Cliente cliente) {
        clientes.remove(cliente);
        System.out.println("Cliente removido" + cliente);
    }

    @Override
    public Cliente buscaPorId(int id) {
        return clientes.get(id);
    }
    
}
