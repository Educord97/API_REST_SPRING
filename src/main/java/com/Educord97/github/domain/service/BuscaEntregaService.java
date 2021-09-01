package com.Educord97.github.domain.service;

import org.springframework.stereotype.Service;

import com.Educord97.github.domain.exception.EntidadeNaoEncontradaException;
import com.Educord97.github.domain.model.Entrega;
import com.Educord97.github.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}

	
	
}
