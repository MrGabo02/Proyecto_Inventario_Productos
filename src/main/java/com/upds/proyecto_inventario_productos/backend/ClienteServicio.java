package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ClienteServicio implements CrudListener<Cliente> {

    private final ClienteRepositorio repositorio;


    @Override
    public Collection<Cliente> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Cliente add(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        repositorio.delete(cliente);
    }
}
