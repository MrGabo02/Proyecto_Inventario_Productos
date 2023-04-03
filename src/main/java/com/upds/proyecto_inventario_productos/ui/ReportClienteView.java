package com.upds.proyecto_inventario_productos.ui;


import com.upds.proyecto_inventario_productos.backend.ClienteServicio;
import com.upds.proyecto_inventario_productos.backend.Inventario;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.vaadin.reports.PrintPreviewReport;

@Route("reporteCliente")
@AnonymousAllowed
public class ReportClienteView extends VerticalLayout{
    public ReportClienteView(ClienteServicio servicio) {
        Button buttonatras = new Button("Atras");
        buttonatras.addClickListener( e -> UI.getCurrent().navigate(ReportesView.class));
        add(buttonatras);

        /*
        var reporteCliente = new PrintPreviewReport<>(Inventario.class,
                "nombreCompleto","direccion","descripcion","telefono");
        reporteCliente.setItems(servicio.findAll());
        add(
                reporteCliente
        );  */
    }
}
