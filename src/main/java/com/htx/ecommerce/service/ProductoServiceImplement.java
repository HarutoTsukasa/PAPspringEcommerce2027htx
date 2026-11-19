package com.htx.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.htx.ecommerce.model.Producto;
import com.htx.ecommerce.repository.IProductoRepository;

@Service
public class ProductoServiceImplement implements ProductoService {

	private IProductoRepository productoRepo;

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepo.save(producto);
	}

	@Override
	public Optional<Producto> get(Long id) {
		// TODO Auto-generated method stub
		return productoRepo.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		productoRepo.save(producto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepo.deleteById(id);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepo.findAll();
	}

}
