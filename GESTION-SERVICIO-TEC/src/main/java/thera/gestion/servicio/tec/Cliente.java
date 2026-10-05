
package thera.gestion.servicio.tec;

public class Cliente extends Persona {
    private String direccion;
    public Cliente (String id, String nombre, String telefono, String email, String direccion){
        super (id, nombre, telefono, email);
        this.direccion = direccion;
        
    }
    
    public String getDireccion(){
        return direccion;
        
    }
    
}
