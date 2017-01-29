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
public class Receta {
    private String nombre;
    private String intrucciones;   
    private String autor;
    private Ingrediente [] ingrediente = new Ingrediente[5];

    
      


       
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
        return "Receta: " + nombre;
    }
    
    
    
   //int, String, void
    //inicializar atributos o propiedades
    
 
    public void setReceta(){       
        this.ingrediente [0] = new Ingrediente();
        this.ingrediente [1] = new Ingrediente();
        this.ingrediente [2] = new Ingrediente();
        this.ingrediente [3] = new Ingrediente();
        this.ingrediente [4] = new Ingrediente();
        
    }
    
    
    public void setRecetaIngredientes(String rnombre1, int rcantidad1,
                                      String rnombre2, int rcantidad2,
                                      String rnombre3, int rcantidad3,
                                      String rnombre4, int rcantidad4,
                                      String rnombre5, int rcantidad5)
    {      
        ingrediente[0].setNombre(rnombre1);
        ingrediente[0].setCantidad(rcantidad1);  
        ingrediente[1].setNombre(rnombre2);
        ingrediente[1].setCantidad(rcantidad2); 
        ingrediente[2].setNombre(rnombre3);
        ingrediente[2].setCantidad(rcantidad3); 
        ingrediente[3].setNombre(rnombre4);
        ingrediente[3].setCantidad(rcantidad4); 
        ingrediente[4].setNombre(rnombre5);
        ingrediente[4].setCantidad(rcantidad5); 
        
        
    }
    
    public String getRecetaIngredientes(){
        return 
        "\n"+
        ingrediente[0].getNombre() + " "+
        ingrediente[0].getCantidad() + "\n"+
        ingrediente[1].getNombre() + " "+
        ingrediente[1].getCantidad() + "\n"+
        ingrediente[2].getNombre() + " "+
        ingrediente[2].getCantidad() + "\n"+
        ingrediente[3].getNombre() + " "+
        ingrediente[3].getCantidad() + "\n"+
        ingrediente[4].getNombre() + " "+
        ingrediente[4].getCantidad();   
    }
  
    //no es constructor
   /*public int Receta(){
       return 0;
   }*/
    
   
}
