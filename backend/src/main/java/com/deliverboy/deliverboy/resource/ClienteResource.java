package com.deliverboy.deliverboy.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliverboy.deliverboy.domain.entities.Cliente;
import com.deliverboy.deliverboy.service.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {	
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	private ResponseEntity<List<Cliente>> clienteFindAll() {
		List<Cliente> list = clienteService.findAll();
		return ResponseEntity.ok().body(list);		
	} 

	@GetMapping(value = "/{id}")
	private ResponseEntity<Cliente> clienteFindById(@PathVariable Long id) {
		Cliente cli = clienteService.findById(id);
		return ResponseEntity.ok().body(cli);
	}

	
}
