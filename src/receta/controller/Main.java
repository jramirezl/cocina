/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;
import java.util.Arrays;
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

        Cocina [] misCocinas = cargador.cargarCocinas();
        Receta [] misRecetas = cargador.cargarRecetas();
         
        //imprimir cada cocina
        for (int i = 0; i < misCocinas.length; i++){
            System.out.print("Mis Cocinas en la posicion i"+ misCocinas[i]);
        }
        // imprimir cada receta
        for (int i = 0; i < misRecetas.length; i++){
                System.out.print("Mis Recetas en la posicion i" + misRecetas[i]);
            }      
        
    }
        

}


