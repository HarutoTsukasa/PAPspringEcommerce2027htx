package com.htx.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htx.ecommerce.model.DetalleOrden;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Long> {

}
