package com.htx.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htx.ecommerce.model.Orden;

public interface IOrdenRepository extends JpaRepository<Orden, Long> {

}
