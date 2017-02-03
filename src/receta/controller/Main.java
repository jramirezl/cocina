/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;
import receta.dto.Condimento;
import receta.dto.Grano;
import receta.dto.Liquido;
import receta.dto.Receta;
import receta.dto.Carne;
import receta.dto.FrutayVerdura;
import receta.dto.Cocina;


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
    iHospital1.usarIngrediente(106, "piezas");
    
    Condimento iHospital2 = new Condimento("Aji");
    iHospital2.usarIngrediente(200, "onzas");
    
    FrutayVerdura iHospital3 = new FrutayVerdura("papa");
    iHospital3.usarIngrediente(1, "libra");
    
    Liquido iHospital4 = new Liquido("Aceite");
    iHospital4.usarIngrediente(100, "galones");
    
    Grano iHospital5 = new Grano("Maiz");
    iHospital5.usarIngrediente(10, "libras");
    
    hospital.agregarIngCocina(iHospital1);
    hospital.agregarIngCocina(iHospital2);
    hospital.agregarIngCocina(iHospital3);
    hospital.agregarIngCocina(iHospital4);
    hospital.agregarIngCocina(iHospital5);
    
    System.out.println(hospital);
    
     /*********************Recetas*********************/
     Receta empanada = new Receta(5);
     empanada.setNombre("Empanada");
     empanada.setAutor("Clotilde");
     empanada.setInstrucciones("Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite");
     
     Carne iEmpanada1 = new Carne("Pollo");
     iEmpanada1.setParte("pechuga");
     iEmpanada1.usarIngrediente(1, "libra");
     
     Condimento iEmpanada2 = new Condimento("Aji");
     iEmpanada2.usarIngrediente(2, "onzas");
     
     FrutayVerdura iEmpanada3 = new FrutayVerdura("papa");
     iEmpanada3.usarIngrediente(1, "libra");
     
     Liquido iEmpanada4 = new Liquido("Aceite");
     iEmpanada4.usarIngrediente(16, "onzas");
     
     Grano iEmpanada5 = new Grano("Maiz");
     iEmpanada5.usarIngrediente(1, "libra");
     
     empanada.agregarIngrediente(iEmpanada1);
     empanada.agregarIngrediente(iEmpanada2);
     empanada.agregarIngrediente(iEmpanada3);
     empanada.agregarIngrediente(iEmpanada4);
     empanada.agregarIngrediente(iEmpanada5);
     
     System.out.println(empanada);
     
    
 /******************************************UNIVERSIDAD***********************************************/
  /*********************Cocina*********************/
    Cocina universidad = new Cocina(3);
    universidad.setNombreCocina("Harvard");
    universidad.setUbicacionCocina("Cambridge,MA");
    universidad.setAliasCocina("Estudiantes de Maestria");    
    
    Carne iUniversidad1 = new Carne("Cerdo");
    iUniversidad1.setParte("Costilla");
    iUniversidad1.usarIngrediente(1500, "libras");
    
    Liquido iUniversidad2 = new Liquido("Aceite");
    iUniversidad2.usarIngrediente(200, "Galones");
    
    Condimento iUniversidad3 = new Condimento("barbecue");
    iUniversidad3.usarIngrediente(100, "onzas");
    
    universidad.agregarIngCocina(iUniversidad1);
    universidad.agregarIngCocina(iUniversidad2);
    universidad.agregarIngCocina(iUniversidad3);
    
    System.out.println(universidad);
    
     /*********************Recetas*********************/
    
    Receta costillasCerdo = new Receta(2);
    costillasCerdo.setNombre("Costillas de Cerdo");
    costillasCerdo.setAutor("Flor");
    costillasCerdo.setInstrucciones("Bane las constillas de cerdo en barbecue and pongalas a las parilla al menos una hora");
     
    Carne iCostillasCerdo1 = new Carne("Cerdo");
    iCostillasCerdo1.setParte("Costilla");
    iCostillasCerdo1.usarIngrediente(1, "libra");
     
    Condimento iCostillasCerdo2 = new Condimento("barbecue");
    iCostillasCerdo2.usarIngrediente(5, "onzas");  
     
    costillasCerdo.agregarIngrediente(iCostillasCerdo1);
    costillasCerdo.agregarIngrediente(iCostillasCerdo2);
    
    System.out.println(costillasCerdo);
    
    }

}


