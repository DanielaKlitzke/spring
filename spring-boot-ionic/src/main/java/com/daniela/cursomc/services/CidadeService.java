package com.daniela.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniela.cursomc.domain.Cidade;
import com.daniela.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findByEstado(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}
