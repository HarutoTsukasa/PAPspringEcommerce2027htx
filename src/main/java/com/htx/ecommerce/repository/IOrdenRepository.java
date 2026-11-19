package com.htx.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htx.ecommerce.model.Orden;
import com.htx.ecommerce.model.Usuario;

public interface IOrdenRepository extends JpaRepository<Orden, Long> {

	List<Orden> findByUsuario(Usuario usuario);

}
