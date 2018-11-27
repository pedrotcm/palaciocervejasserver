package br.com.palaciocervejas.ws.services;

import br.com.palaciocervejas.domain.entities.Client;

public interface ClientService extends BaseService<Client> {

	Client findByEmailIgnoreCase( String email );

	Client findByEmailAndPassword( String email, String password );

}
