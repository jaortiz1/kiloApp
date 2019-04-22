package com.salesianos.triana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianos.triana.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	 Usuario findByNombre(String nombre);
}
