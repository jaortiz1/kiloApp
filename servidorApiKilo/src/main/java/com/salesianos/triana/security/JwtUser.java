package com.salesianos.triana.security;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class JwtUser implements UserDetails {

    private final Long id;
    
    private final String nombre;
    private final String password;
    private final String email;
    private final boolean enabled;
    private final String grupoEscolar;
    private final Date lastPasswordResetDate;
    private final Collection<? extends GrantedAuthority> authorities;

    public JwtUser(
          Long id,
          String nombre,
          String password,
          String email,
          boolean enabled,
          String grupoEscolar,
          Date lastPasswordResetDate,
          Collection<? extends GrantedAuthority> authorities
    ) {
        this.id = id;
        
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.grupoEscolar=grupoEscolar;
        this.lastPasswordResetDate = lastPasswordResetDate;
        this.authorities = authorities;
    }

    @JsonIgnore
    public Long getId() {
        return id;
    }
    

    public String getGrupoEscolar() {
		return grupoEscolar;
	}

	public String getNombre() {
		return nombre;
	}

	@JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

   
    public String getEmail() {
        return email;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

   
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

}

