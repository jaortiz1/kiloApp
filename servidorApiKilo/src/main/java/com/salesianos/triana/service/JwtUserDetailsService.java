package com.salesianos.triana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.salesianos.triana.model.Usuario;
import com.salesianos.triana.repository.UsuarioRepository;
import com.salesianos.triana.security.JwtUserFactory;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario save(Usuario u) {
		return usuarioRepository.save(u);
	}

	@Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByNombre(nombre);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", nombre));
        } else {
            return JwtUserFactory.create(user);
        }
    }
	
	
	
}
