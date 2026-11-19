package com.htx.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.htx.ecommerce.model.Orden;
import com.htx.ecommerce.model.Usuario;
import com.htx.ecommerce.repository.IOrdenRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrdenServiceImplement implements IOrdenService {

	private final IOrdenRepository ordenRepo;

	@Override
	public Orden save(Orden orden) {
		// TODO Auto-generated method stub
		return ordenRepo.save(orden);
	}

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return ordenRepo.findAll();
	}

	@Override
	public String generarNumeroOrden() {
		List<Orden> ordenes = findAll();

		int numero = ordenes.stream().map(Orden::getNumero).mapToInt(Integer::parseInt).max().orElse(0) + 1;

		return String.format("%013d", numero);
	}

	@Override
	public List<Orden> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return ordenRepo.findByUsuario(usuario);
	}

	@Override
	public Optional<Orden> findById(Long id) {
		// TODO Auto-generated method stub
		return ordenRepo.findById(id);
	}

}
