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
    private Ingrediente [] ingrediente = new Ingrediente[5];
    private int indiceIngredientes = 0;

   
       
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
    
    
    
   //int, String, void
    //inicializar atributos o propiedades
    
 
    public void setReceta(){       
        this.getIngrediente() [0] = new Ingrediente();
        this.getIngrediente() [1] = new Ingrediente();
        this.getIngrediente() [2] = new Ingrediente();
        this.getIngrediente() [3] = new Ingrediente();
        this.getIngrediente() [4] = new Ingrediente();
        
    }
    
    
    public void agregarIngrediente(Ingrediente ingrediente)
    {      
        this.getIngrediente()[this.indiceIngredientes] = ingrediente;
        indiceIngredientes++;
        
    }
    
    public String getRecetaIngredientes(){
        return 
        "\n"+
        getIngrediente()[0].getNombre() + " "+
        getIngrediente()[0].getCantidad() + "\n"+
        getIngrediente()[1].getNombre() + " "+
        getIngrediente()[1].getCantidad() + "\n"+
        getIngrediente()[2].getNombre() + " "+
        getIngrediente()[2].getCantidad() + "\n"+
        getIngrediente()[3].getNombre() + " "+
        getIngrediente()[3].getCantidad() + "\n"+
        getIngrediente()[4].getNombre() + " "+
        getIngrediente()[4].getCantidad();   
    }
  
    //no es constructor
   /*public int Receta(){
       return 0;
   }*/

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
    
   
}
