package com.htx.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.htx.ecommerce.model.Usuario;

public interface IUsuarioService {

	public Usuario save(Usuario usuario);

	public Optional<Usuario> get(Long id);

	public void update(Usuario usuario);

	public void delete(Long id);

	Optional<Usuario> findById(Long id);

	Optional<Usuario> findByEmail(String email);

	List<Usuario> findAll();

}
