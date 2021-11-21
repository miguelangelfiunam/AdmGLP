package mx.unam.admglp.modelo.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, ID extends Serializable> {
	
	void save(T entity);

	T get(ID id);

	void delete(ID id);
	
	void update(T entity);

	List<T> findAll();

}
