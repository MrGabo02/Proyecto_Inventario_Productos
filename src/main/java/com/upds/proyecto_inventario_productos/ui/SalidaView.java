package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Salida;
import com.upds.proyecto_inventario_productos.backend.SalidaServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("salida")
@RolesAllowed("ADMIN")
public class SalidaView extends VerticalLayout {
    public SalidaView(SalidaServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Salida.class, servicio);
        crud.getGrid().setColumns("cantidad","fechaRegistro","descuento","precioVenta","montoTotal");
        crud.getCrudFormFactory().setVisibleProperties("cantidad","fechaRegistro","descuento","precioVenta","montoTotal");
        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Salida"),
                crud
        );
    }
}
