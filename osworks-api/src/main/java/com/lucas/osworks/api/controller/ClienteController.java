package com.lucas.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var client1 = new Cliente();
		client1.setId(1L);
		client1.setNome("Lucas");
		client1.setEmail("teste@gmail.com");
		client1.setTelefone("1233333");

		var client2 = new Cliente();
		client2.setId(2L);
		client2.setNome("Maria");
		client2.setEmail("teste2@gmail.com");
		client2.setTelefone("1212121212");

		return Arrays.asList(client1, client2);
	}

}
