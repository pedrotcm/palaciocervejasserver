package br.com.palaciocervejas.domain.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import br.com.palaciocervejas.domain.entities.Client;

@Projection( name = "fullData", types = Client.class )
public interface ClientProjection {

	Long getId();

	String getEmail();

	String getPassword();

	String getName();

	String getPhone();

	String getAddress();

	String getCity();

	String getState();
	
}
