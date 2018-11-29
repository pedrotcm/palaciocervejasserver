package br.com.palaciocervejas.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.ws.services.ClientService;

@RepositoryRestController
@RequestMapping( "/clients" )
public class ClientController {

	@Autowired
	private ClientService clientService;

	@PostMapping
	@RequestMapping( "/register" )
	public ResponseEntity<?> register( @RequestBody Client client ) {

		Client clientExists = clientService.findByEmailIgnoreCase( client.getEmail() );
		if ( clientExists != null ) {
			return ResponseEntity.badRequest().body( "O e-mail informado já está em uso" );
		}
		Client entity = clientService.save( client );

		return ResponseEntity.ok( entity );

	}
}
