package com.salesianos.triana.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CAMPANIA")
public class Campania {
	  	@Id
	    @Column(name = "ID")
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	    private Long id;
	  	@Column(name = "NOMBRE", length = 50, unique = true)
	    @NotNull
	    @Size(min = 4, max = 50)
	    private String nombre;
	  	@OneToMany(mappedBy = "campania", fetch = FetchType.EAGER)
	  	@JsonBackReference
	  	private Set<TipoProducto> tiposDeProductos;
	  	
	  	//helper
	  	public void addTipoProducto(TipoProducto tipoProducto){
	  		this.tiposDeProductos.add(tipoProducto);
	  		tipoProducto.setCampania(this);
	  	}

}
