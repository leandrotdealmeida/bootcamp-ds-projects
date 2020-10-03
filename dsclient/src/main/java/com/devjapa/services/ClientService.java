package com.devjapa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devjapa.dto.ClientDTO;
import com.devjapa.entities.Client;
import com.devjapa.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;

	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> listClients = repository.findAll(pageRequest);
		return listClients.map(cli -> new ClientDTO(cli));
	}
	
	

}
