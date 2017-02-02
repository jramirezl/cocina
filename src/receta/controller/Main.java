/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;
import receta.*;


/**
 *
 * @author jpramire
 */
public class Main {
   
  

    public static void main(String[] args) {/*
    
    /******************************************HOSPITAL***********************************************/
    /*********************Cocina*********************/
    Cocina hospital = new Cocina(5); 
    hospital.setNombreCocina("Childrens' Hospital");
    hospital.setUbicacionCocina("Cincinnati,OH");
    hospital.setAliasCocina("Primer piso"); 
    
    Carne ihospital1 = new Carne("Pollo");
    ihospital1.setParte("pechuga");
    ihospital1.setCantidad(106);
    
    Condimento ihospital2 = new Condimento("Aji");
    ihospital2.setCantidad(200);
    ihospital2.setMedida("onzas");
    
    FrutayVerdura ihospital3 = new FrutayVerdura("papa");
    ihospital3.setCantidad(1);
    ihospital3.setMedida("libraS");
    
    Liquido ihospital4 = new Liquido("Aceite");
    ihospital4.setCantidad(100);
    ihospital4.setMedida("galones");
    
    Grano ihospital5 = new Grano("Maiz");
    ihospital5.setCantidad(10);
    ihospital5.setMedida("libras");
    
    hospital.agregarIngCocina(ihospital1);
    hospital.agregarIngCocina(ihospital2);
    hospital.agregarIngCocina(ihospital3);
    hospital.agregarIngCocina(ihospital4);
    hospital.agregarIngCocina(ihospital5);
    
     /*********************Recetas*********************/
    /* Receta empanada = new Receta(5);
     empanada.setNombre("Empanada");
     empanada.setAutor("Clotilde");
     empanada.setInstrucciones("Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite");
     Ingrediente i1 = new Ingrediente("papa", 2, "vegetal");*/
     
    
 /******************************************UNIVERSIDAD***********************************************/
  /*********************Cocina*********************/
    Cocina universidad = new Cocina(3);
    universidad.setNombreCocina("Harvard");
    universidad.setUbicacionCocina("Cambridge,MA");
    universidad.setAliasCocina("Estudiantes de Maestria");    
    
    Carne iUniversidad1 = new Carne("Cerdo");
    iUniversidad1.setParte("Costilla");
    iUniversidad1.setMedida("Libras");
    
    Liquido iUniversidad2 = new Liquido("Agua");
    iUniversidad2.setCantidad(200);
    iUniversidad2.setMedida("Galones");
    
    Condimento iUniversidad3 = new Condimento("barbecue");
    iUniversidad3.setCantidad(100);
    iUniversidad3.setMedida("Onzas");
    
    universidad.agregarIngCocina(iUniversidad1);
    universidad.agregarIngCocina(ihospital2);
    universidad.agregarIngCocina(ihospital3);
    }
     /*********************Recetas*********************/
  
}


