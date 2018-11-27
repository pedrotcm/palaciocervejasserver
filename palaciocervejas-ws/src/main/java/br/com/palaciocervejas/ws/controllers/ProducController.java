package br.com.palaciocervejas.ws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.palaciocervejas.domain.entities.Product;
import br.com.palaciocervejas.ws.services.ProductService;

@RepositoryRestController
@RequestMapping( "/products" )
public class ProducController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public ResponseEntity<?> saveClient( @RequestBody Product product ) {

		Product entity = productService.save( product );
		// Client entity = clientService.save( client.toEntity() );

		return ResponseEntity.ok( entity );
	}

	// @GetMapping
	// public ResponseEntity<?> getProfessionals() {
	// return ResponseEntity.ok( professionalService.findAll() );
	// }

}
