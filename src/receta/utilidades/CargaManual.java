/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.utilidades;

import receta.dto.Cocina;
import receta.dto.Receta;
import java.util.Arrays;
import receta.dto.Carne;
import receta.dto.Condimento;
import receta.dto.FrutayVerdura;
import receta.dto.Grano;
import receta.dto.Liquido;
import receta.dto.def.Ingrediente;
import receta.controller.Chef;


/**
 *
 * @author Evelyn-da
 */
public class CargaManual implements Cargador{
    
    Cocina[] misCocinas;
    
    public Cocina[] cargarCocinas(){
        Cocina[] cocinas = new Cocina[2];
        Cocina hospital = new Cocina(5); 
        
        hospital.setNombreCocina("Childrens' Hospital");
        hospital.setUbicacionCocina("Cincinnati,OH");
        hospital.setAliasCocina("Primer piso");

        Carne iHospital1 = new Carne("Pollo");
        iHospital1.setParte("pechuga");
        iHospital1.setCantidad(106);
        iHospital1.setMedida("onzas");

        Condimento iHospital2 = new Condimento("Aji");
        iHospital2.setCantidad(200);
        iHospital2.setMedida("onzas");

        FrutayVerdura iHospital3 = new FrutayVerdura("papa");
        iHospital3.setCantidad(1);
        iHospital3.setMedida("onzas");

        Liquido iHospital4 = new Liquido("Aceite");
        iHospital4.setCantidad(100);
        iHospital4.setMedida("onzas");

        Grano iHospital5 = new Grano("Maiz");
        iHospital5.setCantidad(10);
        iHospital5.setMedida("onzas");

        hospital.agregarIngCocina(iHospital1);
        hospital.agregarIngCocina(iHospital2);
        hospital.agregarIngCocina(iHospital3);
        hospital.agregarIngCocina(iHospital4);
        hospital.agregarIngCocina(iHospital5);
        cocinas[0] = hospital;

        
        Cocina universidad = new Cocina(3);
        universidad.setNombreCocina("Harvard");
        universidad.setUbicacionCocina("Cambridge,MA");
        universidad.setAliasCocina("Estudiantes de Maestria");    

        Carne iUniversidad1 = new Carne("Cerdo");
        iUniversidad1.setParte("Costilla");
        iUniversidad1.setCantidad(1500);
        iUniversidad1.setMedida("onzas"); 


        Liquido iUniversidad2 = new Liquido("Aceite");
        iUniversidad2.setCantidad(200);
        iUniversidad2.setMedida("onzas"); 

        Condimento iUniversidad3 = new Condimento("barbecue");
        iUniversidad3.setCantidad(100);
        iUniversidad3.setMedida("onzas"); 


        universidad.agregarIngCocina(iUniversidad1);
        universidad.agregarIngCocina(iUniversidad2);
        universidad.agregarIngCocina(iUniversidad3);

        cocinas[1] = universidad;
        //System.out.println("Cocinas desde Carga Manual: "+ Arrays.toString(cocinas));
        return cocinas;

    }
    
    
    public Receta[] cargarRecetas(){
        Receta[] recetas = new Receta[2];
        Chef esaChef = new Chef();
        
        Receta empanada = new Receta(5);
        empanada.setNombre("Empanada");
        empanada.setAutor("Clotilde");
        empanada.setInstrucciones("Divida la masa en triangulos y coloque los ingredientes y cierre la masa y frite");

        Carne iEmpanada1 = new Carne("Pollo");
        iEmpanada1.setParte("pechuga");
        iEmpanada1.setCantidad(1);
        iEmpanada1.setMedida("onzas");
        iEmpanada1.setValor(2.50);

        Condimento iEmpanada2 = new Condimento("Aji");
        iEmpanada2.setCantidad(2);
        iEmpanada2.setMedida("onzas");
        iEmpanada2.setValor(1.50);

        FrutayVerdura iEmpanada3 = new FrutayVerdura("papa");
        iEmpanada3.setCantidad(1);
        iEmpanada3.setMedida("onzas");
        iEmpanada3.setValor(1.00);

        Liquido iEmpanada4 = new Liquido("Aceite");
        iEmpanada4.setCantidad(16);
        iEmpanada4.setMedida("onzas");
        iEmpanada4.setValor(4.00);

        Grano iEmpanada5 = new Grano("Maiz");
        iEmpanada5.setCantidad(1);
        iEmpanada5.setMedida("onzas");  
        iEmpanada5.setValor(1.00);

        empanada.agregarIngrediente(iEmpanada1);
        empanada.agregarIngrediente(iEmpanada2);
        empanada.agregarIngrediente(iEmpanada3);
        empanada.agregarIngrediente(iEmpanada4);
        empanada.agregarIngrediente(iEmpanada5);
        recetas[0] = empanada;
        
        Receta costillasCerdo = new Receta(2);
        costillasCerdo.setNombre("Costillas de Cerdo");
        costillasCerdo.setAutor("Flor");
        costillasCerdo.setInstrucciones("Bane las constillas de cerdo en barbecue and pongalas a las parilla al menos una hora");

        Carne iCostillasCerdo1 = new Carne("Cerdo");
        iCostillasCerdo1.setParte("Costilla");
        iCostillasCerdo1.setCantidad(1);
        iCostillasCerdo1.setMedida("onzas"); 
        iCostillasCerdo1.setValor(55.00);


        Condimento iCostillasCerdo2 = new Condimento("barbecue"); 
        iCostillasCerdo2.setCantidad(5);
        iCostillasCerdo2.setMedida("onzas"); 
        iCostillasCerdo2.setValor(5.00);

        costillasCerdo.agregarIngrediente(iCostillasCerdo1);
        costillasCerdo.agregarIngrediente(iCostillasCerdo2);        
        
        recetas[1] = costillasCerdo;
        //System.out.println("Recetas desde Carga Manual: "+ Arrays.toString(recetas));
        return recetas;
    }

}
