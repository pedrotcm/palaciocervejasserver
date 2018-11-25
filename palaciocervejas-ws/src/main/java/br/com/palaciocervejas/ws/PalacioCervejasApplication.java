package br.com.palaciocervejas.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( "br.com.palaciocervejas.domain.entities" )
public class PalacioCervejasApplication {

	public static void main( String[] args ) {
		SpringApplication.run( PalacioCervejasApplication.class, args );
	}

}
