
package thera.gestion.servicio.tec;

public class InventarioRepuesto {
    private Repuesto[] listaRepuestos;
    private int contador;
    
    public InventarioRepuesto(int capacidadMaxima){
        this.contador = 0;
        this.listaRepuestos = new Repuesto[capacidadMaxima];
    }
}
