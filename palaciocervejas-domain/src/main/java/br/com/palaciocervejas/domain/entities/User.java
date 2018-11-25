package br.com.palaciocervejas.domain.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance( strategy = InheritanceType.JOINED )
@Table( name = "USUARIO" )
public abstract class User implements Serializable{

	private static final long serialVersionUID = -4234837300025019096L;

	@Id
	@Column( name = "PK_ID_USUARIO" )
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;

	@Column( name = "USUARIO" )
	private String username;

	@Column( name = "SENHA" )
	private String password;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}

}
