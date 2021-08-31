package com.Educord97.github.api.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Educord97.github.api.model.EntregaModel;
import com.Educord97.github.domain.model.Entrega;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaMapper {
	
	private ModelMapper modelMapper;
	
	public EntregaModel toModel(Entrega entrega) {
		return modelMapper.map(entrega, EntregaModel.class);
	}
	
	
	public List<EntregaModel> toColletionModel(List<Entrega> entregas) {
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
		
	}

}















