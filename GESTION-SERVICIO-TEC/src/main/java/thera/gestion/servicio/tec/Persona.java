
package thera.gestion.servicio.tec;

public abstract class Persona {
    protected String id, nombre, telefono, email;
    
    public Persona(String id, String nombre, String telefono, String email){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getId(){
        return id;
    }
    
    public String getTelefono(){
        return telefono;
        
    }
    
    public String getEmail(){
        return email;
        
    }
    
}
