package com.lucas.osworks.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.osworks.domain.exception.BusinessException;
import com.lucas.osworks.domain.model.Cliente;
import com.lucas.osworks.domain.repository.ClienteRepository;

@Service
public class CadastroClientService {

	@Autowired
	private ClienteRepository clientRepository;

	public Cliente save(Cliente client) {
		Cliente clienteExistente = clientRepository.findByEmail(client.getEmail());
		if(clienteExistente != null && !clienteExistente.equals(client)) {
			throw new BusinessException("Ja existe um cliente cadastrado com este email");
		}
		return clientRepository.save(client);
	}

	public void deleteById(Long clientId) {
		clientRepository.deleteById(clientId);
	}

}
