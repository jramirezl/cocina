/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;

import receta.Ingrediente;
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
       Receta ajiaco = new Receta();


       //instaciacion. creando un objeto. pone el objeto en memoria
       
       //implementar encapsulamiento gettters/settters
       //usar getter/setter para el acceso a los atributos

       empanadaObj.setAutor("Flor");
       empanadaObj.setInstrucciones("Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite");
       empanadaObj.setNombre("Empanada");       
       //empanadaObj.setReceta();
              
       Ingrediente i1 = new Ingrediente("papa", 2, "vegetal");
       Ingrediente i2 = new Ingrediente("carne", 5, "carne");
       Ingrediente i3 = new Ingrediente("masa", 1, "harina");
       Ingrediente i4 = new Ingrediente("aji", 3, "salsa");
       Ingrediente i5 = new Ingrediente("aceite", 3, "liquido");
       
       /*i1.setNombre("papa");
       i1.setCantidad(2);
       i2.setNombre("carne");
       i2.setCantidad(5);
       i3.setNombre("masa");
       i3.setCantidad(5);
       i4.setNombre("aji");
       i4.setCantidad(5);
       i5.setNombre("aceite");
       i5.setCantidad(1);*/
       
       empanadaObj.agregarIngrediente(i1);
       empanadaObj.agregarIngrediente(i2);
       empanadaObj.agregarIngrediente(i3);
       empanadaObj.agregarIngrediente(i4);
       empanadaObj.agregarIngrediente(i5);

        System.out.println(empanadaObj);

       /////////////////////////////////AJIACO//////////////////////////////////////////////////////////
                  
       ajiaco.setAutor("Clotilde");
       ajiaco.setInstrucciones("ponga los ingredientes en una olla y calientelos a fuego lento");
       ajiaco.setNombre("Ajiaco");
       //ajiaco.setReceta();
       
       Ingrediente i6 = new Ingrediente("pollo", 2, "carne");
       Ingrediente i7 = new Ingrediente("marzorca", 5, "vegetal");
       Ingrediente i8 = new Ingrediente("platano", 3, "vegetal");
       Ingrediente i9 = new Ingrediente("agua", 2, "liquido");
       
       /*i6.setNombre("pollo");
       i6.setCantidad(2);
       i7.setNombre("mazorca");
       i7.setCantidad(3);
       i8.setNombre("platano");
       i8.setCantidad(10);
       i9.setNombre("agua");
       i9.setCantidad(1);*/
       
       ajiaco.agregarIngrediente(i1);
       ajiaco.agregarIngrediente(i6);
       ajiaco.agregarIngrediente(i7);
       ajiaco.agregarIngrediente(i8);
       ajiaco.agregarIngrediente(i9);
       
       //ajiaco.setRecetaIngredientes("agua", 1, "pollo", 2, "papa", 5, "mazorca", 3, "platano", 10);
        System.out.println(ajiaco);
            
    }
  
}
