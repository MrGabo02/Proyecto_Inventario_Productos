package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Producto;
import com.upds.proyecto_inventario_productos.backend.ProductoServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("producto")
@RolesAllowed("ADMIN")
public class ProductoView extends VerticalLayout{
    public ProductoView(ProductoServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(HomeView.class));
        add(buttonatras);

        var crud = new GridCrud<>(Producto.class, servicio);

        crud.getGrid().setColumns("nombre","fabricacion","fechaVencimiento","descripcion","tipoCategoria");

        crud.getGrid().addColumn(producto -> producto.getInventario().getCodInventario()).setHeader("Inventario");

        crud.getCrudFormFactory().setVisibleProperties("nombre","fabricacion","fechaVencimiento","descripcion","tipoCategoria");

        crud.setAddOperationVisible(true);
        add(
                new H1("Gestion de Productos"),
                crud
        );
    }
}
