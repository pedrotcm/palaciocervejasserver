package br.com.palaciocervejas.domain.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import br.com.palaciocervejas.domain.entities.Category;

@Projection( name = "fullData", types = Category.class )
public interface CategoryProjection {

	Long getId();

	String getName();

}
