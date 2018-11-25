package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.palaciocervejas.domain.entities.Product;
import br.com.palaciocervejas.domain.entities.projections.ProductProjection;

@RepositoryRestResource( collectionResourceRel = "products", path = "products", excerptProjection = ProductProjection.class )
public interface ProductRepository extends CrudRepository<Product, Long> {

}
