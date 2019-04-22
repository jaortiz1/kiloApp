package com.salesianos.triana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianos.triana.model.TipoProducto;
import com.salesianos.triana.repository.TipoProductoRepository;

@Service
public class TipoProductoService {
	@Autowired
	TipoProductoRepository tipoProductoRepository;
	
	
	public TipoProducto save(TipoProducto tipoProducto) {
		return tipoProductoRepository.save(tipoProducto);

	}
}
