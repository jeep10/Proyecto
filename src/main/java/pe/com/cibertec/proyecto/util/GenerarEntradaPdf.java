/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.cibertec.proyecto.util;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import pe.com.cibertec.proyecto.domain.Detalle;

/**
 *
 * @author Asus
 */
@Component("listaCompraUsuarios")
public class GenerarEntradaPdf extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {

        @SuppressWarnings("unchecked")
        List<Detalle> detalles = (List<Detalle>) model.get("detalles");

        PdfPTable tablaDetalle = new PdfPTable(8);

        detalles.forEach(detalle -> {

            tablaDetalle.addCell(String.valueOf(detalle.getDetalleCompra().getCompra().getId_compra()));
            tablaDetalle.addCell(detalle.getDetalleCompra().getCompra().getEvento().getNombre());
            tablaDetalle.addCell(detalle.getDetalleCompra().getZonaEvento().getEvento().getLocal().getNombre());
            tablaDetalle.addCell(detalle.getDetalleCompra().getZonaEvento().getZona());
            tablaDetalle.addCell(String.valueOf(detalle.getPrecio()));
            tablaDetalle.addCell(String.valueOf(detalle.getCantidad()));
            tablaDetalle.addCell(detalle.getDetalleCompra().getCompra().getFecha().toString());
            tablaDetalle.addCell(String.valueOf(detalle.getDetalleCompra().getCompra().getTotal()));

        });

        document.add(tablaDetalle);
    }

}
