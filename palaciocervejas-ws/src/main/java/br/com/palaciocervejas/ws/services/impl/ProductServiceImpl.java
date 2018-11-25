package br.com.palaciocervejas.ws.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palaciocervejas.domain.entities.Product;
import br.com.palaciocervejas.domain.entities.StockHistory;
import br.com.palaciocervejas.domain.enums.TransactionType;
import br.com.palaciocervejas.ws.repositories.ProductRepository;
import br.com.palaciocervejas.ws.repositories.StockHistoryRepository;
import br.com.palaciocervejas.ws.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private StockHistoryRepository stockHistoryRepository;

	@Override
	public Product save( Product entity ) {
		StockHistory stockHistory = new StockHistory();
		stockHistory.setProduct( entity );
		if ( entity.getId() == null ) {
			stockHistory.setQuantity( entity.getStockQuantity() );
			stockHistory.setTransactionType( TransactionType.INPUT );
		} else {
			Product lastProductStatus = productRepository.findById( entity.getId() ).orElse( null );
			Integer differQuantity = lastProductStatus.getStockQuantity() - entity.getStockQuantity();
			stockHistory.setTransactionType( differQuantity <= 0 ? TransactionType.INPUT : TransactionType.OUTPUT );
			stockHistory.setQuantity( Math.abs( differQuantity ) );
		}

		productRepository.save( entity );
		stockHistoryRepository.save( stockHistory );

		return entity;
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
