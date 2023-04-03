package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class InventarioServicio implements CrudListener<Inventario> {

    private final InventarioRepositorio repositorio;


    @Override
    public Collection<Inventario> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Inventario add(Inventario inventario) {
        return repositorio.save(inventario);
    }

    @Override
    public Inventario update(Inventario inventario) {
        return repositorio.save(inventario);
    }

    @Override
    public void delete(Inventario inventario) {
        repositorio.delete(inventario);
    }
}
