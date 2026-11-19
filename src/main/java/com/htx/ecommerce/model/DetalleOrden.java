package com.htx.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class DetalleOrden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_detalles;
	private String nombre_producto;
	private Double cantidad;
	private Double precio;
	private Double total;

	@JoinColumn(name = "id_orden")
	@ManyToOne
	private Orden orden;

	@JoinColumn(name = "id_producto")
	@ManyToOne
	private Producto producto;

}
