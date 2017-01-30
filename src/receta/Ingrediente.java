/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

/**
 *
 * @author jpramire
 */
public class Ingrediente {

    private String nombre;
    private int cantidad;
    private String tipo;
    
    //escritura
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    //lectura
    public String getNombre(){
       return this.nombre;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    @Override
    public String toString() {
        return "Ingrediente: " + getNombre()
                + " cantidad: " + getCantidad();
                //+ " tipo: " + getTipo();
    }
    
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
