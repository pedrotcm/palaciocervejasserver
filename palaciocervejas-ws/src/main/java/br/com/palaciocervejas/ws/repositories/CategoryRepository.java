package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.palaciocervejas.domain.entities.Category;
import br.com.palaciocervejas.domain.entities.projections.CategoryProjection;

@RepositoryRestResource( collectionResourceRel = "categories", path = "categories", excerptProjection = CategoryProjection.class )
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
