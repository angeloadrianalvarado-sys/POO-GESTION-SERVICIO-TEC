
package thera.gestion.servicio.tec;

public class Reporte {
    protected static void imprimirFicha(OrdenServicio o) {
        System.out.println("\n==============================================");
        System.out.println("           HOJA DE SERVICIO TECNICO           ");
        System.out.println("==============================================");
        System.out.println("Codigo: " + o.getCodigo() + " | Estado: " + o.getEstadoActual());
        System.out.println("Cliente: " + o.getCliente().getNombre() + " (" + o.getCliente().getTelefono() + ")");
        System.out.println("Equipo: " + o.getEquipo().getDetalle());
        System.out.println("Tecnico a cargo: " + (o.getTecnicoAsignado() != null ? o.getTecnicoAsignado().getNombre() : "Por asignar"));
        System.out.println("Diagnostico: " + o.getDiagnostico());

        System.out.println("\n--- Repuestos Utilizados ---");
        Repuesto[] rep = o.getRepuesto();
        for (int i = 0; i < o.getContadorRepuestos(); i++) {
            System.out.println("- " + rep[i].getNombre() + " x" + rep[i].getCantidad() + 
                               " | S/ " + rep[i].getSubTotal());
        }
        System.out.println("Mano de obra: S/ " + o.getCostoManoObra());
        System.out.println("TOTAL: S/ " + o.calcularTotal());

        System.out.println("\n--- Historial de Seguimiento ---");
        RegistroSeguimiento[] hist = o.getHistorial();
        for (int i = 0; i < o.getContadorHistorial(); i++) {
            System.out.println(hist[i].getTextoFormateado());
        }
        System.out.println("==============================================");
    }

}
