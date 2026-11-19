package com.htx.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htx.ecommerce.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
