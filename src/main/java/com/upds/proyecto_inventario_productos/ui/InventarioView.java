package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Inventario;
import com.upds.proyecto_inventario_productos.backend.InventarioServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("inventario")
@RolesAllowed("ADMIN")
public class InventarioView extends VerticalLayout{
    public InventarioView(InventarioServicio servicio1) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Inventario.class, servicio1);
        crud.getGrid().setColumns("stockMaximo","stockMinimo","cantidad","almacen");
        crud.getCrudFormFactory().setVisibleProperties("stockMaximo","stockMinimo","cantidad","almacen");
        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Inventario"),
                crud
        );
    }
}
