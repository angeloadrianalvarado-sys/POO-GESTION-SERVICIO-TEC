
package thera.gestion.servicio.tec;

public class GESTIONSERVICIOTEC extends Reporte{

    public static void main(String[] args) {
        GestorServicioTecnico sistema = new GestorServicioTecnico(50);

        // Clientes y técnicos
        Cliente cli1 = new Cliente("72938471", "Jorge Ramirez", "981234567", "jorge.ramirez@gmail.com", "Calle Real 123");
        Tecnico tec1 = new Tecnico("45678901", "Adrian Alvarado", "994567812", "azalva@taller.com", "Laptops y Placas Madre");
        Equipo eq1 = new Equipo("Laptop", "ASUS", "TUF Gaming F15", "SN-998822", "Con cargador, sin caja");

        // 1. Recepción
        OrdenServicio ord = sistema.registrarOrden(cli1, eq1, "No da imagen en pantalla y calienta en la base");
        System.out.println("Orden registrada: " + ord.getCodigo());

        // 2. Asignación y revisión
        ord.asignarTecnico(tec1, "Admin");
        ord.registrarDiagnostico("Falla en integrado de video y mantenimiento preventivo requerido", 90.0, tec1.getNombre());

        // 3. Repuestos utilizados
        ord.agregarRepuesto(new Repuesto("REP-01", "Pasta Termica Cooler Master", 35.0, 1));
        ord.agregarRepuesto(new Repuesto("REP-02", "Thermal pads 1.5mm", 15.0, 2));

        // 4. Avances del trabajo
        ord.cambiarEstado(EstadoOrden.EN_REPARACION, "Reemplazo de pads y limpieza de disipador en curso", tec1.getNombre());
        ord.cambiarEstado(EstadoOrden.LISTO_ENTREGA, "Equipo probado con benchmarks de video por 45 minutos. Estable.", tec1.getNombre());

        // 5. Imprimir resumen
        imprimirFicha(ord);
        
    }
}
