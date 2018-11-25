package br.com.palaciocervejas.domain.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name = "PRODUTO" )
@JsonIgnoreProperties( { "hibernateLazyInitializer", "handler" } )
public class Product implements Serializable {

	private static final long serialVersionUID = 8983009199318095442L;

	@Id
	@Column( name = "PK_ID_PRODUTO" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;

	@Column( name = "NOME" )
	private String name;

	@Column( name = "VALOR" )
	private BigDecimal value;

	@Column( name = "QUANTIDADE_ESTOQUE" )
	private Integer stockQuantity;

	@ManyToOne( fetch = FetchType.LAZY )
	@JoinColumn( name = "FK_ID_CATEGORIA", referencedColumnName = "PK_ID_CATEGORIA", nullable = false )
	private Category category;

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

	public BigDecimal getValue() {
		return value;
	}

	public void setValue( BigDecimal value ) {
		this.value = value;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity( Integer stockQuantity ) {
		this.stockQuantity = stockQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory( Category category ) {
		this.category = category;
	}

}
