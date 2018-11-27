package br.com.palaciocervejas.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table( name = "CLIENTE" )
@OnDelete( action = OnDeleteAction.CASCADE )
public class Client  extends User{

	private static final long serialVersionUID = -7497408012130316981L;

	@Column( name = "CPF" )
	private String cpf;

	@Column( name = "NOME" )
	private String name;

	@Column( name = "TELEFONE" )
	private String phone;

	@Column( name = "ENDERECO" )
	private String address;

	@Column( name = "MUNICIPIO" )
	private String city;

	@Column( name = "UF" )
	private String state;

	public String getCpf() {
		return cpf;
	}

	public void setCpf( String cpf ) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone( String phone ) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress( String address ) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity( String city ) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState( String state ) {
		this.state = state;
	}

}
