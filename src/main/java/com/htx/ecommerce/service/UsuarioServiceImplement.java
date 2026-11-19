package com.htx.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.htx.ecommerce.model.Usuario;
import com.htx.ecommerce.repository.IUsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImplement implements IUsuarioService {

	private final IUsuarioRepository usuarioRepo;

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(usuario);
	}

	@Override
	public Optional<Usuario> get(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepo.findById(id);
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepo.save(usuario);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepo.deleteById(id);
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepo.findById(id);
	}

	@Override
	public Optional<Usuario> findByEmail(String email) {
		// TODO Auto-generated method stub
		return usuarioRepo.findByEmail(email);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepo.findAll();
	}

}
