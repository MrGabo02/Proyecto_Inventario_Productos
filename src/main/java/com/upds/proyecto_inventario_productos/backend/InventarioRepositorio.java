package com.upds.proyecto_inventario_productos.backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepositorio extends JpaRepository<Inventario, Long> {
}
