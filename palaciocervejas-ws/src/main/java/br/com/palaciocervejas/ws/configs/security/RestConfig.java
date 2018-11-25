package br.com.palaciocervejas.ws.configs.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class RestConfig {

	@Bean
	public FilterRegistrationBean corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials( true );
		config.addAllowedOrigin( "*" );
		config.addAllowedHeader( "*" );
		config.addAllowedMethod( "OPTIONS" );
		config.addAllowedMethod( "GET" );
		config.addAllowedMethod( "POST" );
		config.addAllowedMethod( "PUT" );
		config.addAllowedMethod( "DELETE" );
		config.addAllowedMethod( "PATCH" );
		config.setMaxAge( 3600l );

		source.registerCorsConfiguration( "/**", config );
		FilterRegistrationBean bean = new FilterRegistrationBean( new CorsFilter( source ) );
		bean.setOrder( Ordered.HIGHEST_PRECEDENCE );
		return bean;
	}

}