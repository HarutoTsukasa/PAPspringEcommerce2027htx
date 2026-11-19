package com.htx.ecommerce.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_orden;
	private String numero;
	private LocalDateTime fecha_creacion;
	private LocalDateTime fecha_recibida;
	private Double total;

	@JoinColumn(name = "id_usuario")
	@ManyToOne
	private Usuario usuario;

	@OneToMany(mappedBy = "orden")
	private List<DetalleOrden> detalle;

}
