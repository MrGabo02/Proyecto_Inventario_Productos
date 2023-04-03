package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Cliente;
import com.upds.proyecto_inventario_productos.backend.ClienteServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("cliente")
@RolesAllowed("ADMIN")
public class ClienteView extends VerticalLayout {
    public ClienteView(ClienteServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Cliente.class, servicio);
        crud.getGrid().setColumns("nombreCompleto","direccion","descripcion","telefono");
        crud.getCrudFormFactory().setVisibleProperties("nombreCompleto","direccion","descripcion","telefono");
        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Clientes"),
                crud
        );
    }
}
