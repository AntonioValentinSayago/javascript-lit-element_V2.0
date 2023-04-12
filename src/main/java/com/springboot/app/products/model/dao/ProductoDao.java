package com.springboot.app.products.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.products.model.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>
{
	
}
