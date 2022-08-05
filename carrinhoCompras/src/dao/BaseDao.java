package dao;

import java.util.Collection;
import java.util.Comparator;

public interface BaseDao<E, ID>{

    E salvar(E entidade);

    Collection<E> buscarTodos();

    Collection<E> buscarTodos(Comparator<E> comparator);

    void remover(E entidade);

    E buscaPorId(int id);

}
