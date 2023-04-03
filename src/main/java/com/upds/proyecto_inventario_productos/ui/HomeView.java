package com.upds.proyecto_inventario_productos.ui;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("")
@AnonymousAllowed
public class HomeView extends VerticalLayout {
    public HomeView() {
        add(
                new H1("Pagina de Inicio")
        );
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text_align","center");

        Button buttonProveedor = new Button("Proveedor");
        buttonProveedor.addClickListener( e -> UI.getCurrent().navigate(ProveedorView.class));
        add(buttonProveedor);

        Button buttonCliente = new Button("Cliente");
        buttonCliente.addClickListener( e -> UI.getCurrent().navigate(ClienteView.class));
        add(buttonCliente);


        Button buttonInventario = new Button("Proveedor");
        buttonInventario.addClickListener( e -> UI.getCurrent().navigate(InventarioView.class));
        add(buttonInventario);

        Button buttonProducto = new Button("Producto");
        buttonProducto.addClickListener( e -> UI.getCurrent().navigate(ProductoView.class));
        add(buttonProducto);

        Button buttonEntrada = new Button("Entrada");
        buttonEntrada.addClickListener( e -> UI.getCurrent().navigate(EntradaView.class));
        add(buttonEntrada);

        Button buttonSalida = new Button("Salida");
        buttonSalida.addClickListener( e -> UI.getCurrent().navigate(SalidaView.class));
        add(buttonSalida);

        Button buttonReportes = new Button("Reportes");
        buttonReportes.addClickListener( e -> UI.getCurrent().navigate(ReportesView.class));
        add(buttonReportes);
    }
}
