package br.com.palaciocervejas.ws.services;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable> {

	T save( T entity );

	T load( Long id );

	void delete( T entity );

	List<T> findAll();
}
