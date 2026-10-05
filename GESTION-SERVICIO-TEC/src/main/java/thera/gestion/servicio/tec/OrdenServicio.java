
package thera.gestion.servicio.tec;

public class OrdenServicio {
    private String codigo, fallaReportada, diagnostico;
    private Cliente cliente;
    private Equipo equipo;
    private Tecnico tecnicoAsignado;
    private EstadoOrden estadoActual;
    private double costoManoObra;
    private Repuesto[] repuesto;
    private int contadorRepuestos;
    private RegistroSeguimiento[] historial;
    private int contadorHistorial;
    
    public OrdenServicio(String codigo, Cliente cliente, Equipo equipo, String fallaReportada){
        this.codigo = codigo;
        this.cliente = cliente;
        this.equipo = equipo;
        this.fallaReportada = fallaReportada;
        this.estadoActual = EstadoOrden.RECIBIDO;
        this.diagnostico = "Pendiente de evaluacion";
        this.costoManoObra = 0.0;
        this.repuesto = new Repuesto[30];
        this.contadorRepuestos = 0;
        this.historial = new RegistroSeguimiento[30];
        this.contadorHistorial = 0;
        
    }
    
    public void asignarTecnico(Tecnico tecnico, String usuario){
        this.tecnicoAsignado = tecnico;
        cambiarEstado(EstadoOrden.EN_DIAGNOSTICO, "Tecnico Asignado:"+tecnico.getNombre(), usuario);
    }
    
    public void registrarDiagnostico(String diagnostico, double costoManoObra, String usuario){
        
    }
    
    public void cambiarEstado(EstadoOrden nuevoEstado, String motivo, String usuario){
        this.estadoActual = nuevoEstado;
    }
    
    
}
