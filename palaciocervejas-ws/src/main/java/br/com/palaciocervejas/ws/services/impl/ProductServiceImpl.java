package br.com.palaciocervejas.ws.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palaciocervejas.domain.entities.Product;
import br.com.palaciocervejas.ws.repositories.ProductRepository;
import br.com.palaciocervejas.ws.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product save( Product entity ) {
		return productRepository.save( entity );
	}

	@Override
	public Product load( Long id ) {
		return productRepository.findById( id ).orElse( null );
	}

	@Override
	public void delete( Product entity ) {
		productRepository.delete( entity );
	}

	@Override
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

}
