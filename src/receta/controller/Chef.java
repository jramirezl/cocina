/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;

import receta.dto.Cocina;
import receta.dto.FrutayVerdura;
import receta.dto.Receta;
import receta.dto.def.Ingrediente;
import receta.dto.def.Solido;
import receta.dto.Liquido;
import receta.utilidades.CargaManual;
import receta.utilidades.Cargador;
import receta.dto.Receta;

/**
 *
 * @author Evelyn-da
 */
public class Chef {
    
    public void cocinarReceta(Cocina objCocina, Receta objReceta)
    {
        Ingrediente [] ingredientesReceta = objReceta.getIngrediente();
        Ingrediente [] ingredientesCocina = objCocina.getIngrediente();
        
        for (int i = 0; i < ingredientesReceta.length; i++){
            for (int j = 0; j < ingredientesCocina.length; j++){
                if (ingredientesReceta[i].getNombre().equals(ingredientesCocina[j].getNombre()))
                {
                    ingredientesCocina[j].usarIngrediente(ingredientesReceta[i]);
                }
            }
        }
    }
    
    public double valorReceta(Receta[] recetas,String nombreReceta){
        double valor1 = 0;
        for (int i = 0; i < recetas.length; i++){
            if(recetas[i].getNombre().equals(nombreReceta)){
                for (int j = 0; j < recetas[i].getIngrediente().length;j++){
                    valor1 += recetas[i].getIngrediente()[j].getValor()* recetas[i].getIngrediente()[j].getCantidad(); 
                }
            }
        }
        System.out.println("El valor de la Receta es: $" + valor1);
        return valor1;
    }
    
    public void buscarRecetasPorIngrediente(Receta[] recetas, String ingrediente){
         for (int i = 0; i < recetas.length; i++){
             boolean encontroIngrediente = false;
             for (int j = 0; j < recetas[i].getIngrediente().length && !encontroIngrediente; j++){ //Recorra mientras sea falso
                if (recetas[i].getIngrediente()[j].getNombre().equals(ingrediente)){
                    encontroIngrediente = true;
                }
             }
             if (encontroIngrediente){
                System.out.println("Puedes usar la receta: " + recetas[i].getNombre() + " con el ingrediente: " + ingrediente);
             }else{
                 System.out.println("Lo sentimos, no tenemos recetas con el ingrediente: " + ingrediente);
             }
         }
    }
    
    public void numeroVerduras(Cocina[] cocinas){
        for (int i = 0; i < cocinas.length; i++){
        }
    }
    
    public void calcularReceta(Cocina[] cocina, Receta[] receta){
        for (int i = 0; i < cocina.length; i++){
            
        }
    }
}
