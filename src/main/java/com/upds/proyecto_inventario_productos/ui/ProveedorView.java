package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Proveedor;
import com.upds.proyecto_inventario_productos.backend.ProveedorServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("proveedor")
@RolesAllowed("ADMIN")
public class ProveedorView extends VerticalLayout {
    public ProveedorView(ProveedorServicio servicio) {

        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Proveedor.class, servicio);
        crud.getGrid().setColumns("nombreCompañia","nombreCompleto","direccion","telefono");
        crud.getCrudFormFactory().setVisibleProperties("nombreCompañia","nombreCompleto","direccion","telefono");
        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Proveedores"),
                crud
        );

    }
}
