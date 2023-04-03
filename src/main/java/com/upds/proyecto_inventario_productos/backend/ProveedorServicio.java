package com.upds.proyecto_inventario_productos.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProveedorServicio implements CrudListener<Proveedor> {


    private final ProveedorRepositorio repositorio;

    @Override
    public List<Proveedor> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Proveedor add(Proveedor proveedor) {
        return repositorio.save(proveedor);
    }

    @Override
    public Proveedor update(Proveedor proveedor) {
        return repositorio.save(proveedor);
    }

    @Override
    public void delete(Proveedor proveedor) {
        repositorio.delete(proveedor);
    }
}
