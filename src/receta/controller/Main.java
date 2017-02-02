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
    
    Carne iHospital1 = new Carne("Pollo");
    iHospital1.setParte("pechuga");
    iHospital1.setCantidad(106);
    
    Condimento iHospital2 = new Condimento("Aji");
    iHospital2.setCantidad(200);
    iHospital2.setMedida("onzas");
    
    FrutayVerdura iHospital3 = new FrutayVerdura("papa");
    iHospital3.setCantidad(1);
    iHospital3.setMedida("libraS");
    
    Liquido iHospital4 = new Liquido("Aceite");
    iHospital4.setCantidad(100);
    iHospital4.setMedida("galones");
    
    Grano iHospital5 = new Grano("Maiz");
    iHospital5.setCantidad(10);
    iHospital5.setMedida("libras");
    
    hospital.agregarIngCocina(iHospital1);
    hospital.agregarIngCocina(iHospital2);
    hospital.agregarIngCocina(iHospital3);
    hospital.agregarIngCocina(iHospital4);
    hospital.agregarIngCocina(iHospital5);
    
     /*********************Recetas*********************/
     /*Receta empanada = new Receta(5);
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
    universidad.agregarIngCocina(iUniversidad2);
    universidad.agregarIngCocina(iUniversidad3);
    }
     /*********************Recetas*********************/
  
}


