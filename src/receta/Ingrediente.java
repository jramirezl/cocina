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

public abstract class Ingrediente {

    private String nombre;
    private int cantidad;
    private String tipo;
    private String tamano;
    
    //Constructor que recibe parametros
    public Ingrediente (String nombreIng, int cantIng, String tipoIng, String tamanoIng)
    {
        this.nombre = nombreIng;
        this.cantidad = cantIng;
        this.tipo = tipoIng;
        this.tamano = tamanoIng;
    }            
    
    //escritura
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //lectura
    public String getNombre(){
       return this.nombre;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {        
        this.tipo = tipo;
    }
        

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
        @Override
    public String toString() {
        return "Ingrediente: " + getNombre()
                + " cantidad: " + getCantidad()
                + " tipo: " + getTipo()
                + "tamano" + getTamano();
    }
    
    abstract public void Tamano();
}

class Liquidos extends Ingrediente{

    public Liquidos(String nombreIng, int cantIng, String tipoIng, String tamanoIng) {
        super(nombreIng, cantIng, tipoIng, tamanoIng);
    }
    public void Tamano(){
        
    }
}

class Granos extends Ingrediente{

    public Granos(String nombreIng, int cantIng, String tipoIng, String tamanoIng) {
        super(nombreIng, cantIng, tipoIng, tamanoIng);
    }
    public void Tamano(){
        
    }
}

class Carnes extends Ingrediente{

    public Carnes(String nombreIng, int cantIng, String tipoIng, String tamanoIng) {
        super(nombreIng, cantIng, tipoIng, tamanoIng);
    }
    public void Tamano(){
        
    }
}

class Verduras extends Ingrediente{

    public Verduras (String nombreIng, int cantIng, String tipoIng, String tamanoIng) {
        super(nombreIng, cantIng, tipoIng, tamanoIng);
    }
    public void Tamano(){
        
    }
}

class Frutas extends Ingrediente{

    public Frutas(String nombreIng, int cantIng, String tipoIng, String tamanoIng) {
        super(nombreIng, cantIng, tipoIng, tamanoIng);
    }
    public void Tamano(){
        
    }
}