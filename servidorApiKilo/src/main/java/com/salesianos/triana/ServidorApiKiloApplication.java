package com.salesianos.triana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianos.triana.model.Campania;
import com.salesianos.triana.model.TipoProducto;
import com.salesianos.triana.model.Usuario;
import com.salesianos.triana.service.CampaniaService;
import com.salesianos.triana.service.TipoProductoService;
import com.salesianos.triana.service.JwtUserDetailsService;

@SpringBootApplication
public class ServidorApiKiloApplication {
	
	@Autowired
	JwtUserDetailsService usuarioService;
	@Autowired
	TipoProductoService tipoProductoService;
	@Autowired
	CampaniaService campaniaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ServidorApiKiloApplication.class, args);
	}
	
	 @Bean
	    public CommandLineRunner demoData() {
	        return args -> { 
	        	
	        	//creamos unos cuantos usuarios
	        	Usuario u = new Usuario();
	        	u.setEmail("luismi@gmail.com");
	        	u.setGrupoEscolar("2ºDAM");
	        	u.setNombre("Luis Miguel Lopez Magaña");
	        	u.setPassword("1234");
	        	usuarioService.save(u);
	        	
	        	/*Campania c = new Campania();
	        	c.setNombre("Kilo");
	        	TipoProducto t = new TipoProducto();
	        	t.setCantidad(10);
	        	t.setNombre("sal");
	        	
	        	campaniaService.save(c, t);*/
	        	
	            
	        };
	    }
}
