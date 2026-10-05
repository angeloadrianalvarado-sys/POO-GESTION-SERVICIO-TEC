
package thera.gestion.servicio.tec;

public class Equipo {
    private String tipo, marca, modelo, serie, observaciones;
    
    public Equipo (String tipo, String marca, String modelo, String serie, String observaciones){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.observaciones = observaciones;
        this.serie = serie;
    }
    
    public String getDetalle(){
        return tipo+" "+marca+" "+modelo+" Serie: ("+serie+") ";
    }
    
    public String getObervaciones(){
        return "Las observaciones encontradas son: "+observaciones;
    }
}
