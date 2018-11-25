package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.domain.entities.projections.ProductProjection;

@RepositoryRestResource( collectionResourceRel = "clients", path = "clients", excerptProjection = ProductProjection.class )
public interface ClientRepository extends CrudRepository<Client, Long> {


}
