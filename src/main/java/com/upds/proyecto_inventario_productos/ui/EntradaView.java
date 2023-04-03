package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Entrada;
import com.upds.proyecto_inventario_productos.backend.EntradaServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;


@Route("entrada")
@RolesAllowed("ADMIN")
public class EntradaView extends VerticalLayout {
    public EntradaView(EntradaServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Entrada.class, servicio);
        crud.getGrid().setColumns("cantidad","fechaRegistro","tipoEntrada");
        crud.getCrudFormFactory().setVisibleProperties("cantidad","fechaRegistro","tipoEntrada");
        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Entradas"),
                crud
        );
    }
}
