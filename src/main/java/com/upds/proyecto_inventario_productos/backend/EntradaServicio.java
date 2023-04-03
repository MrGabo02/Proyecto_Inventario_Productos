package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntradaServicio implements CrudListener<Entrada> {

    private final EntradaRepositorio repositorio;

    @Override
    public List<Entrada> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Entrada add(Entrada entrada) {
        return repositorio.save(entrada);
    }

    @Override
    public Entrada update(Entrada entrada) {
        return repositorio.save(entrada);
    }

    @Override
    public void delete(Entrada entrada) {
        repositorio.delete(entrada);
    }
}
