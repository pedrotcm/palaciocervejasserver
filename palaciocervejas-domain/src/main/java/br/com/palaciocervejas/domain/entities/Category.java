package br.com.palaciocervejas.domain.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name = "CATEGORIA" )
@JsonIgnoreProperties( { "hibernateLazyInitializer", "handler" } )
public class Category implements Serializable{

	private static final long serialVersionUID = -2797872442499986470L;

	@Id
	@Column( name = "PK_ID_CATEGORIA" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;

	@Column( name = "NOME" )
	private String name;

	@OneToMany( mappedBy = "category" )
	private Set<Product> products;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts( Set<Product> products ) {
		this.products = products;
	}

}
