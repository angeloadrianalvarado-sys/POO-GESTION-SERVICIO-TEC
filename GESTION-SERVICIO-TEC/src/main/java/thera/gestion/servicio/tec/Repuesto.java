
package thera.gestion.servicio.tec;

public class Repuesto {
    private String codigo, nombre;
    private double precioUnitario;
    private int cantidad;
    
    public Repuesto(String codigo, String nombre, double precioUnitario, int cantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecioUnitario(){
        return precioUnitario;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double getSubTotal(){
        return cantidad*precioUnitario;
    }
}
