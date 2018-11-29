package br.com.palaciocervejas.ws.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.palaciocervejas.domain.entities.Product;
import br.com.palaciocervejas.domain.entities.projections.ProductProjection;

@RepositoryRestResource( collectionResourceRel = "products", path = "products", excerptProjection = ProductProjection.class )
public interface ProductRepository extends JpaRepository<Product, Long> {

	//@formatter:off
	@Query( "from Product p where lower(p.name) like CONCAT('%', lower(:query), '%')"
			+ " or "
			+ "lower(p.category.name) like CONCAT('%', lower(:query), '%')" 
//			+ " or "
//			+ "CONVERT(p.value,DECIMAL(10,2)) = :query" 
			)
	List<Product> findByFilter(  @Param( "query" ) String query );
	//@formatter:on
}
