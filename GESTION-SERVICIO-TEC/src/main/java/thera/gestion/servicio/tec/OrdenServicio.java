
package thera.gestion.servicio.tec;

public class OrdenServicio  extends Cambios{
    private String codigo, fallaReportada;
    private Cliente cliente;
    private Equipo equipo;
    private Tecnico tecnicoAsignado;
    private Repuesto[] repuesto;
    private int contadorRepuestos;
    
    public OrdenServicio(String codigo, Cliente cliente, Equipo equipo, String fallaReportada){
        super();
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
    
    public boolean agregarRepuesto(Repuesto r){
        if (contadorRepuestos < repuesto.length){
            repuesto[contadorRepuestos] = r;
            contadorRepuestos++;
            return true;
        }
        System.out.println("No se pueden agregar mas repuestos. Arreglo lleno");
        return false;
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
