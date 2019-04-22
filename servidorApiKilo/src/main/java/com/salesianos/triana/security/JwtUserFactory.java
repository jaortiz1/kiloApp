package com.salesianos.triana.security;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.salesianos.triana.model.Authority;
import com.salesianos.triana.model.Usuario;


public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(Usuario user) {
        return new JwtUser(
                user.getId(),
                user.getNombre(),
                user.getPassword(),
                user.getEmail(),
                user.getEnabled(),
                user.getGrupoEscolar(),
                user.getLastPasswordResetDate(),
                mapToGrantedAuthorities(user.getAuthorities())
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());
    }
}
