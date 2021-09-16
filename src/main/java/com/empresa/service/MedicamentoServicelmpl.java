package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepositorio;
@Service
public class MedicamentoServicelmpl implements MedicamentoService{
	@Autowired
	
	private MedicamentoRepositorio repository;

	@Override
	public Medicamento insertaActualiza(Medicamento obj) {
		return repository.save(obj);
		
	}

	@Override
	public List<Medicamento> listaMedicamento() {
	
		return repository.findAll();
	}

}
