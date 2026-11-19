package com.htx.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htx.ecommerce.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
