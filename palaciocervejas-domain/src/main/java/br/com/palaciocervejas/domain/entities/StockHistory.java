package br.com.palaciocervejas.domain.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.palaciocervejas.domain.enums.TransactionType;

@Entity
@Table( name = "HISTORICO_PRODUTO" )
@JsonIgnoreProperties( { "hibernateLazyInitializer", "handler" } )
public class StockHistory implements Serializable {

	private static final long serialVersionUID = 4408541434081888245L;

	@Id
	@Column( name = "PK_ID_HISTORICO_ESTOQUE" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;

	@Column( name = "DATA_HISTORORICO" )
	private Date historicalDate;

	@Column( name = "QUANTIDADE" )
	private Integer quantity;

	@Column( name = "TIPO_TRANSACAO" )
	@Enumerated
	private TransactionType transactionType;

	@ManyToOne( fetch = FetchType.LAZY )
	@JoinColumn( name = "FK_ID_PRODUTO", referencedColumnName = "PK_ID_PRODUTO", nullable = false )
	private Product product;

	public StockHistory() {
		historicalDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public Date getHistoricalDate() {
		return historicalDate;
	}

	public void setHistoricalDate( Date historicalDate ) {
		this.historicalDate = historicalDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity( Integer quantity ) {
		this.quantity = quantity;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType( TransactionType transactionType ) {
		this.transactionType = transactionType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct( Product product ) {
		this.product = product;
	}

}
