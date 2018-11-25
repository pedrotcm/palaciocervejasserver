package br.com.palaciocervejas.ws.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import br.com.palaciocervejas.domain.entities.Category;
import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.domain.entities.Product;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
	@Override
	public void configureRepositoryRestConfiguration( RepositoryRestConfiguration config ) {
		super.configureRepositoryRestConfiguration( config );
		config.exposeIdsFor( Client.class, Category.class, Product.class );
	}
}