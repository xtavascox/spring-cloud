package com.formaciondbi.springboot.app.productos.models.sercvice;

import com.formaciondbi.springboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public  Producto findById(Long id);

}
