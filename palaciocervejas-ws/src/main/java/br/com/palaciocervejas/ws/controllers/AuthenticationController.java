package br.com.palaciocervejas.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.ws.services.ClientService;

@RestController
@RequestMapping( "/api/authentication" )
public class AuthenticationController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping
	@RequestMapping( "/login" )
	public ResponseEntity<?> login( @RequestParam( "email" ) String email, @RequestParam( "password" ) String password ) {

		Client user = clientService.findByEmailAndPassword( email, password );
		if ( user == null ) {
			return ResponseEntity.badRequest().body( "Usuário ou senha inválidos" );
		}

		return ResponseEntity.ok().body( user );

	}
}
