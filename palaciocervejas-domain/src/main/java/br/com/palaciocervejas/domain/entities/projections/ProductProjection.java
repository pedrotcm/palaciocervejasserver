package br.com.palaciocervejas.domain.entities.projections;

import java.math.BigDecimal;

import org.springframework.data.rest.core.config.Projection;

import br.com.palaciocervejas.domain.entities.Category;
import br.com.palaciocervejas.domain.entities.Product;

@Projection( name = "fullData", types = Product.class )
public interface ProductProjection {

	Long getId();

	String getName();

	BigDecimal getValue();

	Integer getStockQuantity();

	Category getCategory();
	
}
