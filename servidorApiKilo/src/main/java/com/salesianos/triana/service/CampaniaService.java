package com.salesianos.triana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianos.triana.model.Campania;
import com.salesianos.triana.model.TipoProducto;
import com.salesianos.triana.repository.CampaniaRepository;
import com.salesianos.triana.repository.TipoProductoRepository;

@Service
public class CampaniaService {
	@Autowired
	CampaniaRepository campaniaRepository;
	@Autowired
	TipoProductoRepository tipoProductoRepository;
	
	
	public Campania save(Campania campania, TipoProducto tipoProducto) {
		campania.addTipoProducto(tipoProducto);
		tipoProductoRepository.save(tipoProducto);
		return campaniaRepository.save(campania);
		

	}
}
