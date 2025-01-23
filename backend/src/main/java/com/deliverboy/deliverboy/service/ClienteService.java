package com.deliverboy.deliverboy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.deliverboy.deliverboy.domain.entities.Cliente;
import com.deliverboy.deliverboy.domain.repositories.ClienteRepository;

@Component
@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll(); 
	}
	
	
	
}
