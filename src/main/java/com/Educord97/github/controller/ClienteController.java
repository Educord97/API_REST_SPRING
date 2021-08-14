package com.Educord97.github.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Educord97.github.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("41-4444-5555");
		cliente1.setEmail("joao@teste.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("maria");
		cliente2.setTelefone("11-333-222");
		cliente2.setEmail("maria@teste.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
