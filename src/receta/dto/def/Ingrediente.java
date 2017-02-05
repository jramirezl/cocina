/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.dto.def;

/**
 *
 * @author jpramire
 */

public abstract class Ingrediente {

    private String nombre;
    private int cantidad;
    private String medida;//Litro, kilo, cup, onzas, 
    
    //Constructor que recibe parametros

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the medida
     */
    public String getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public abstract void usarIngrediente(Ingrediente ingrediente);
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " Cantidad: " +cantidad + " Medida: " + medida; 
    }
    
    public boolean equals(Ingrediente ingrediente){
        if( (ingrediente != null) && (ingrediente instanceof Ingrediente) ) {
            Ingrediente temp = (Ingrediente)ingrediente;
            return( this.nombre == temp.nombre );
            }
        else {
            return( false );
            }        
    }   

}

