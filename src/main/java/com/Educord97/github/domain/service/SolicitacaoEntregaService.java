package com.Educord97.github.domain.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Educord97.github.domain.exception.NegocioException;
import com.Educord97.github.domain.model.Cliente;
import com.Educord97.github.domain.model.Entrega;
import com.Educord97.github.domain.model.StatusEntrega;
import com.Educord97.github.domain.repository.ClienteRepository;
import com.Educord97.github.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {
	
	private CatalogoClienteService catalogoClienteService; 
	private EntregaRepository entregaRepository;

	@Transactional
	public Entrega solicitar(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		
		return entregaRepository.save(entrega);
		
	}
}
