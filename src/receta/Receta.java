/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

import java.util.Arrays;
/**
 *
 * @author jpramire
 */
public class Receta {
    private String nombre;
    private String intrucciones;   
    private String autor;
    private int indiceIngredientes = 0;
    private Ingrediente [] ingrediente; 
    
    public Receta(int cantidad){
        ingrediente = new Ingrediente[cantidad];
    }
   
       
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setInstrucciones(String instrucciones)
    {
        this.intrucciones = instrucciones;
    }
    
    public String getInstrucciones()
    {
        return this.intrucciones;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    

    @Override
    public String toString() {
        return "\nReceta: " + this.getNombre() +
                           "\nAutor: " + this.getAutor() +
                            "\n Ingredientes: " + Arrays.toString(this.getIngrediente()) +
                           "\n Intrucciones: " + this.getInstrucciones();
    }
    

      /**
     * @return the ingrediente
     */
    public Ingrediente[] getIngrediente() {
        return ingrediente;
    }

    /**
     * @param ingrediente the ingrediente to set
     */
    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }
    
        
    public void agregarIngrediente(Ingrediente ingrediente)
    {      
        this.getIngrediente()[this.indiceIngredientes] = ingrediente;
        indiceIngredientes++;
        
    }
    
   
}
