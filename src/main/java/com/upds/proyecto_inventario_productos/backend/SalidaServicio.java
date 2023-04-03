package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class SalidaServicio implements CrudListener<Salida> {

    private final SalidaRepositorio repositorio;


    @Override
    public Collection<Salida> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Salida add(Salida salida) {
        return repositorio.save(salida);
    }

    @Override
    public Salida update(Salida salida) {
        return repositorio.save(salida);
    }

    @Override
    public void delete(Salida salida) {
        repositorio.delete(salida);
    }
}
