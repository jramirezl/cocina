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
import receta.utilidades.CargaManual;
import receta.utilidades.Cargador;



/**
 *
 * @author jpramire
 */
public class Main {
   
  

    public static void main(String[] args) {       
        
        //abstraccion de subclase a superclase
        //leer de herencia 
        Cargador cargador = new CargaManual();
        Chef esaChef = new Chef();
        
        Cocina [] misCocinas = cargador.cargarCocinas();
        Receta [] misRecetas = cargador.cargarRecetas();

        System.out.println("El antes: cocina[0]" + misCocinas[0]);
        System.out.println("El antes: Receta[0]" + misRecetas[0]);

        esaChef.cocinarReceta(misCocinas[0], misRecetas[0]);
        System.out.println("El despues: cocina[0]" + misCocinas[0]);
        
        System.out.println(esaChef.valorReceta(misRecetas, "Empanada"));

    }
        

}


