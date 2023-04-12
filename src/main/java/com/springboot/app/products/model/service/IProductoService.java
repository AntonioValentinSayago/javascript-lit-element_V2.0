package com.springboot.app.products.model.service;

import java.util.List;

import com.springboot.app.products.model.entity.Producto;

public interface IProductoService 
{

	public List<Producto> findAll();
	public Producto findById(long id);
}
