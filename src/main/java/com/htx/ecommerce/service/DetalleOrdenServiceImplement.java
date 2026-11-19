package com.htx.ecommerce.service;

import org.springframework.stereotype.Service;

import com.htx.ecommerce.model.DetalleOrden;
import com.htx.ecommerce.repository.IDetalleOrdenRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DetalleOrdenServiceImplement implements IDetalleOrdenService {

	private final IDetalleOrdenRepository detalleRepo;

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		// TODO Auto-generated method stub
		return detalleRepo.save(detalleOrden);
	}

}
