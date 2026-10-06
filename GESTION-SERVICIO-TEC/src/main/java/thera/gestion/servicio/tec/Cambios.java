
package thera.gestion.servicio.tec;

public class Cambios {
    protected double costoManoObra;
    protected String diagnostico;
    protected EstadoOrden estadoActual;
    protected RegistroSeguimiento[] historial;
    protected int contadorHistorial;
    
    public Cambios (){
        
    }
    
    public void agregarHistorial(EstadoOrden estado, String detalle, String usuario){
        if (contadorHistorial < historial.length){
            historial[contadorHistorial] = new RegistroSeguimiento(estado, detalle, usuario);
            contadorHistorial++;
        }
    }
    
    public void cambiarEstado(EstadoOrden nuevoEstado, String motivo, String usuario){
        this.estadoActual = nuevoEstado;
        agregarHistorial(nuevoEstado, motivo, usuario);
    }
    
    public void registrarDiagnostico(String diagnostico, double costoManoObra, String usuario){
        this.diagnostico = diagnostico;
        this.costoManoObra = costoManoObra;
        agregarHistorial(this.estadoActual, "Diagnostico: "+diagnostico, usuario);
    }
    
    
    
    
    
}
