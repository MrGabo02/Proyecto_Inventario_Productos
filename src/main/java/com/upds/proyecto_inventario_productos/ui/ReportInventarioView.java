package com.upds.proyecto_inventario_productos.ui;


import com.upds.proyecto_inventario_productos.backend.Inventario;
import com.upds.proyecto_inventario_productos.backend.InventarioServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.vaadin.reports.PrintPreviewReport;

@Route("reporteInventario")
@AnonymousAllowed
public class ReportInventarioView extends VerticalLayout{
    public ReportInventarioView(InventarioServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(ReportesView.class));
        add(buttonatras);
/*
        var reporte1 = new PrintPreviewReport<>(Inventario.class,
                "stockMaximo","stockMinimo","cantidad","almacen");
        reporte1.setItems(servicio.findAll());
        add(
                reporte1
        );*/
    }
}
