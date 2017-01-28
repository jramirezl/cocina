/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author jpramire
 */
public class Receta {
    private String nombre;
    private String intrucciones;   
    private String autor; 
    private Ingrediente [] ingrediente = new Ingrediente[5];

    @Override
    public String toString() {
        return "Receta: " + nombre;
    }
    
    
    
   //int, String, void
    //inicializar atributos o propiedades
    public Receta(){
        ingrediente [0] = new Ingrediente();
        ingrediente [1] = new Ingrediente();
        ingrediente [2] = new Ingrediente();
        ingrediente [3] = new Ingrediente();
        ingrediente [4] = new Ingrediente();
        
        //ingrediente [0]
    }
    
    
  
    //no es constructor
   public int Receta(){
       return 0;
   }
    
    public static void main(String[] args) {
       Receta empanadaObj = new Receta(); // nombre de la instancia empanadaObj
       //instaciacion. creando un objeto. pone el objeto en memoria
       
       //implementar encapsulamiento gettters/settters
       //usar getter/setter para el acceso a los atributos
       empanadaObj.autor = "Flor";
       empanadaObj.intrucciones = "Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite";
       empanadaObj.nombre = "Empanada";
       empanadaObj.ingrediente[0].setNombre("papa,");
       empanadaObj.ingrediente[0].setCantidad(2);
       empanadaObj.ingrediente[1].setNombre("masa");
       empanadaObj.ingrediente[1].setCantidad(1);
       empanadaObj.ingrediente[2].setNombre("carne");
       empanadaObj.ingrediente[2].setCantidad(5);
       empanadaObj.ingrediente[3].setNombre("aji");
       empanadaObj.ingrediente[3].setCantidad(5);
       empanadaObj.ingrediente[4].setNombre("aceite");
       empanadaObj.ingrediente[4].setCantidad(1);
       

       System.out.println("\nReceta: " + empanadaObj.nombre +
                          "\nAutor: " + empanadaObj.autor +
                          "\n" + empanadaObj.ingrediente[0] + 
                          "\n" + empanadaObj.ingrediente[1] +
                          "\n" + empanadaObj.ingrediente[2] +
                          "\n" + empanadaObj.ingrediente[3] +
                          "\n" + empanadaObj.ingrediente[4] +
                          "\n Intrucciones: " + empanadaObj.intrucciones);
       
       
       Receta Ajiaco = new Receta();
       Ajiaco.nombre = "Ajiaco";
       Ajiaco.autor = "Clotilde";
       Ajiaco.intrucciones = "ponga los ingredientes en una olla y calientelos a fuego lento";
       Ajiaco.ingrediente[0].setNombre("agua");
       Ajiaco.ingrediente[0].setCantidad(1);
       Ajiaco.ingrediente[1].setNombre("pollo");
       Ajiaco.ingrediente[1].setCantidad(2);
       Ajiaco.ingrediente[2].setNombre("papa");
       Ajiaco.ingrediente[2].setCantidad(5);
       Ajiaco.ingrediente[3].setNombre("mazorca");
       Ajiaco.ingrediente[3].setCantidad(3);
       Ajiaco.ingrediente[4].setNombre("tomate");
       Ajiaco.ingrediente[4].setCantidad(2);
       
       System.out.println("\nReceta: " + Ajiaco.nombre +
                          "\nAutor: " + Ajiaco.autor +
                          "\n" + Ajiaco.ingrediente[0] + 
                          "\n" + Ajiaco.ingrediente[1] +
                          "\n" + Ajiaco.ingrediente[2] +
                          "\n" + Ajiaco.ingrediente[3] +
                          "\n" + Ajiaco.ingrediente[4] +
                          "\nIntrucciones: " + Ajiaco.intrucciones);
       

       //ingredientes[0] = new Ingrediente();
       
       //Imprimir las dos recetas de empanadas 
       //Ajiaco
       
    }
  
}
