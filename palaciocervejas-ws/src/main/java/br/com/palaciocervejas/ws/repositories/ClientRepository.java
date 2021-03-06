package br.com.palaciocervejas.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.domain.entities.projections.ClientProjection;

@RepositoryRestResource( collectionResourceRel = "clients", path = "clients", excerptProjection = ClientProjection.class )
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByEmailIgnoreCase( String email );

	Client findByEmailAndPassword( String email, String password );

}
