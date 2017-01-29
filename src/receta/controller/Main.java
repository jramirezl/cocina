/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;
import receta.Receta;

/**
 *
 * @author jpramire
 */
public class Main {
    /*private String nombre;
    private String intrucciones;   
    private String autor; 
    private Ingrediente [] ingrediente = new Ingrediente[5];*/
   
  

    public static void main(String[] args) {
       Receta empanadaObj = new Receta(); // nombre de la instancia empanadaObj


       //instaciacion. creando un objeto. pone el objeto en memoria
       
       //implementar encapsulamiento gettters/settters
       //usar getter/setter para el acceso a los atributos

       empanadaObj.setAutor("Flor");
       empanadaObj.setInstrucciones("Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite");
       empanadaObj.setNombre("Empanada");
       
       empanadaObj.setReceta();
       empanadaObj.setRecetaIngredientes("papa", 2, "masa", 3, "carne", 2, "pollo", 2, "aceite", 10);

       

        System.out.println("\nReceta: " + empanadaObj.getNombre() +
                           "\nAutor: " + empanadaObj.getAutor() +
                            "\n Ingredientes: " + empanadaObj.getRecetaIngredientes()+
                           "\n Intrucciones: " + empanadaObj.getInstrucciones());

       /////////////////////////////////AJIACO//////////////////////////////////////////////////////////
       
       Receta Ajiaco = new Receta();
       Ajiaco.setAutor("Clotilde");
       Ajiaco.setInstrucciones("ponga los ingredientes en una olla y calientelos a fuego lento");
       Ajiaco.setNombre("Ajiaco");
       
       Ajiaco.setReceta();
       Ajiaco.setRecetaIngredientes("agua", 1, "pollo", 2, "papa", 5, "mazorca", 3, "platano", 10);

       

        System.out.println("\nReceta: " + Ajiaco.getNombre() +
                           "\nAutor: " + Ajiaco.getAutor() +
                            "\n Ingredientes: " + Ajiaco.getRecetaIngredientes()+
                           "\n Intrucciones: " + Ajiaco.getInstrucciones());
            
    }
  
}
