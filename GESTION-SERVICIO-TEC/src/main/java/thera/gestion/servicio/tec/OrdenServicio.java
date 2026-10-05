
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
        this.diagnostico = diagnostico;
        this.costoManoObra = costoManoObra;
        agregarHistorial(this.estadoActual, "Diagnostico: "+diagnostico, usuario);
    }
    
    public void cambiarEstado(EstadoOrden nuevoEstado, String motivo, String usuario){
        this.estadoActual = nuevoEstado;
        agregarHistorial(nuevoEstado, motivo, usuario);
    }
    
    public boolean agregarRepuesto(Repuesto r){
        if (contadorRepuestos < repuesto.length){
            repuesto[contadorRepuestos] = r;
            contadorRepuestos++;
            return true;
        }
        System.out.println("No se pueden agregar mas repuestos. Arreglo lleno");
        return false;
    }
    
    public void agregarHistorial(EstadoOrden estado, String detalle, String usuario){
        if (contadorHistorial < historial.length){
            historial[contadorHistorial] = new RegistroSeguimiento(estado, detalle, usuario);
            contadorHistorial++;
        }
    }
    
    public double calcularTotal(){
        double totalRepuestos = 0.0;
        for (int i = 0; i < contadorRepuestos; i++){
            totalRepuestos = totalRepuestos + repuesto[i].getSubTotal();
        }
        return costoManoObra + totalRepuestos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFallaReportada() {
        return fallaReportada;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public EstadoOrden getEstadoActual() {
        return estadoActual;
    }

    public double getCostoManoObra() {
        return costoManoObra;
    }

    public Repuesto[] getRepuesto() {
        return repuesto;
    }

    public int getContadorRepuestos() {
        return contadorRepuestos;
    }

    public RegistroSeguimiento[] getHistorial() {
        return historial;
    }

    public int getContadorHistorial() {
        return contadorHistorial;
    }
    
    
    
}
