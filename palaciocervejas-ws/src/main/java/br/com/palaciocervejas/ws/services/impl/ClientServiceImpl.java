package br.com.palaciocervejas.ws.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.palaciocervejas.domain.entities.Client;
import br.com.palaciocervejas.ws.repositories.ClientRepository;
import br.com.palaciocervejas.ws.services.ClientService;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client save( Client entity ) {
		return clientRepository.save( entity );
	}

	@Override
	public Client load( Long id ) {
		return clientRepository.findById( id ).orElse( null );
	}

	@Override
	public void delete( Client entity ) {
		clientRepository.delete( entity );
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client findByEmailIgnoreCase( String email ) {
		return clientRepository.findByEmailIgnoreCase( email );
	}

	@Override
	public Client findByEmailAndPassword( String email, String password ) {
		return clientRepository.findByEmailAndPassword( email, password );
	}

}
