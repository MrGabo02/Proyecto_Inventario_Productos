package com.upds.proyecto_inventario_productos.ui;

import com.upds.proyecto_inventario_productos.backend.Proveedor;
import com.upds.proyecto_inventario_productos.backend.ProveedorServicio;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.vaadin.reports.PrintPreviewReport;

@Route("reporteProveedor")
@AnonymousAllowed
public class ReportProveedorView extends VerticalLayout{
    public ReportProveedorView(ProveedorServicio servicio1) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(ReportesView.class));
        add(buttonatras);

        var reporte1 = new PrintPreviewReport<>(Proveedor.class,
                "nombreCompañia","nombreCompleto","direccion","telefono");
        reporte1.setItems(servicio1.findAll());
        add(
                reporte1
        );
    }
}
