
package thera.gestion.servicio.tec;


public class GestorServicioTecnico {
    private OrdenServicio[] listaOrdenes;
    private int cantidadOrdenes;
    private int correlativo;
    
    public GestorServicioTecnico(int capacidadMaxima){
        this.listaOrdenes = new OrdenServicio[capacidadMaxima];
        this.cantidadOrdenes = 0;
        this.correlativo = 1000;
    }
    
    public OrdenServicio registrarOrden(Cliente c, Equipo e, String falla){
        if (cantidadOrdenes >= listaOrdenes.length){
            System.out.println("Capacidad de ordenes llena");
            return null;
        }
        correlativo++;
        String nuevoCodigo = "ORD-" + correlativo;
        OrdenServicio nueva = new OrdenServicio(nuevoCodigo, c, e, falla);
        listaOrdenes[cantidadOrdenes] = nueva;
        return nueva;
    }
    
    public OrdenServicio buscarPorCodigo(String codigo) {
        for (int i = 0; i < cantidadOrdenes; i++) {
            if (listaOrdenes[i].getCodigo().equalsIgnoreCase(codigo)) {
                return listaOrdenes[i];
            }
        }
        return null;
    }
    
    public int getCantidadOrdenes(){
        return cantidadOrdenes;
    }
    
}
