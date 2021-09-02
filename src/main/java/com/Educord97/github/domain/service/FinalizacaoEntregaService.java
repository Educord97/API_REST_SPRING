package com.Educord97.github.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Educord97.github.domain.model.Entrega;
import com.Educord97.github.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
	

}
