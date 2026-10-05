
package thera.gestion.servicio.tec;

public class Tecnico extends Persona {
    private String especialidad;
    
    public Tecnico (String id, String nombre, String telefono, String email, String especialidad){
        super(id, nombre, telefono, email);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
}
