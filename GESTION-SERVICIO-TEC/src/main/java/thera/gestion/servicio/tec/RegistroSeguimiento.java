
package thera.gestion.servicio.tec;

import java.time.LocalDateTime;

public class RegistroSeguimiento {
    private LocalDateTime fechaHora;
    private EstadoOrden estado;
    private String observacion, responsable;
    
    public RegistroSeguimiento (EstadoOrden estado, String observacion, String responsable){
        this.fechaHora = LocalDateTime.now();
        this.estado = estado;
        this.observacion = observacion;
        this.responsable = responsable;
    }
    
    
    
}
