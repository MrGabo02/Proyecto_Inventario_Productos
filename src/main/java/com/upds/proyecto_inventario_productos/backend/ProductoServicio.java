package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductoServicio implements CrudListener<Producto> {

    private final ProductoRepositorio repositorio;


    @Override
    public Collection<Producto> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Producto add(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        repositorio.delete(producto);
    }
}
