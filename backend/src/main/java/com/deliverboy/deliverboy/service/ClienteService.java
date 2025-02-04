package com.deliverboy.deliverboy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deliverboy.deliverboy.domain.entities.Cliente;
import com.deliverboy.deliverboy.domain.repositories.ClienteRepository;
import com.deliverboy.deliverboy.exceptions.ResourceNotFoundException;

@Component
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll(); 
	}
	
	
	public Cliente findById(Long id) {
		Optional<Cliente> objCliente = clienteRepository.findById(id);
		return objCliente.orElseThrow( () -> new ResourceNotFoundException(id));
	}
	
	
}
