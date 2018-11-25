package br.com.palaciocervejas.ws.configs;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomResourceProcessor<T> implements ResourceProcessor<Resource<T>> {

	@Override
	public Resource<T> process( Resource<T> resource ) {

		Resource<T> newResource = new Resource<>( resource.getContent() );

		return newResource;
	}
}