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
    Cocina hospital = new Cocina(5); 
    hospital.setNombreCocina("Childrens' Hospital");
    hospital.setUbicacionCocina("Cincinnati,OH");
    hospital.setAliasCocina("Primer piso");    
    
    Carne ihospital1 = new Carne();
    ihospital1.setNombre("Pollo");
    ihospital1.setParte("pechuga");
    ihospital1.setCantidad(106);
    
    Condimento ihospital2 = new Condimento();
    ihospital2.setNombre("Aji");
    ihospital2.setCantidad(200);
    ihospital2.setMedida("onzas");
    
    FrutayVerdura ihospital3 = new FrutayVerdura();
    ihospital3.setNombre("papa");
    ihospital3.setCantidad(1);
    ihospital3.setMedida("libraS");
    
    Liquido ihospital4 = new Liquido();
    ihospital4.setNombre("Aceite");
    ihospital4.setCantidad(100);
    ihospital4.setMedida("galones");
    
    Grano ihospital5 = new Grano();
    ihospital5.setNombre("Maiz");
    ihospital5.setCantidad(10);
    ihospital5.setMedida("libras");
    
 /******************************************UNIVERSIDAD***********************************************/
    Cocina universidad = new Cocina(3);
    universidad.setNombreCocina("Harvard");
    universidad.setUbicacionCocina("Cambridge,MA");
    universidad.setAliasCocina("Estudiantes de Maestria");    
    
    Carne iUniversidad1 = new Carne();
    iUniversidad1.setNombre("Cerdo");
    iUniversidad1.setParte("Costilla");
    iUniversidad1.setMedida("Libras");
    
    Liquido iUniversidad2 = new Liquido();
    iUniversidad2.setNombre("Agua");
    iUniversidad2.setCantidad(200);
    iUniversidad2.setMedida("Galones");
    
    Condimento iUniversidad3 = new Condimento();
    iUniversidad3.setNombre("barbecue");
    iUniversidad3.setCantidad(100);
    iUniversidad3.setMedida("Onzas");
    

    }
    
  
}


