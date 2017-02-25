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
        boolean hayIngrediente = false;
        boolean hayIngredienteCocina = false;
        for (int i = 0; i < ingredientesReceta.length; i++){
            for (int j = 0; j < ingredientesCocina.length; j++){
                if (ingredientesReceta[i].getNombre().equals(ingredientesCocina[j].getNombre())){
                    ingredientesCocina[j].usarIngrediente(ingredientesReceta[i]);
                    hayIngrediente = true;
                    hayIngredienteCocina = true;
                }
                if (hayIngredienteCocina == false){
                    System.out.println("No hay ingredientes suficientes en la Cocina para hacer la Receta hora de ir de shopping");
                    hayIngredienteCocina = true;
                }
                if(hayIngrediente == false){
                    System.out.println("No hay ingredientes suficientes para hacer la Receta falta: " + ingredientesReceta[i].getNombre());
                }
            }
        }
    }
    
    
    public double valorReceta(Receta[] recetas,String nombreReceta){
        double valor1 = 0;
        boolean noHayReceta = false;
        for (int i = 0; i < recetas.length; i++){
            if(recetas[i].getNombre().equals(nombreReceta)){
                for (int j = 0; j < recetas[i].getIngrediente().length;j++){
                    valor1 += recetas[i].getIngrediente()[j].getValor()* recetas[i].getIngrediente()[j].getCantidad();
                    noHayReceta = true;
                }
            }
        }
        if (noHayReceta == false){
            System.out.println("lo sentimos no hay existe la receta ingresada");
            noHayReceta = true;
            }else
        {
            System.out.println("El valor de la Receta es: $" + valor1);
        }
        return valor1;
    }
    
    
    public void buscarRecetasPorIngrediente(Receta[] recetas, String ingrediente){
        boolean encontroIngrediente = false;
        boolean hayReceta = false;
         for (int i = 0; i < recetas.length; i++){
             for (int j = 0; j < recetas[i].getIngrediente().length && !encontroIngrediente; j++){ //Me confunde mucho esto !encontroIngrediente
                if (recetas[i].getIngrediente()[j].getNombre().equals(ingrediente)){
                    encontroIngrediente = true; // si encontro ingrediente = true porque sigue entrado en que momento se siguio volviendo falso
                }
             }
             if (encontroIngrediente){
                System.out.println("Puedes usar la receta: " + recetas[i].getNombre() + " con el ingrediente: " + ingrediente);
                hayReceta = true;
             }
         }
         if (hayReceta == false)
         System.out.println("Lo sentimos, no hay recetas que contengan el ingrediente:  " + ingrediente);
    }
    
    public void numeroVerduras(Cocina[] cocinas){
        for (int i = 0; i < cocinas.length; i++){
            int numeroDeVerduras = 0;
            for (int j = 0; j < cocinas[i].getIngredienteCocina().length; j++){
                if (cocinas[i].getIngredienteCocina()[j] instanceof FrutayVerdura)
                    numeroDeVerduras += cocinas[i].getIngrediente()[j].getCantidad();{
                }
            }
            System.out.println("la cocina " + cocinas[i].getNombreCocina() + " tiene " + numeroDeVerduras + " tipo frutas y verduras");
        }
    }
    
    
    public void calcularReceta(Cocina cocina, Receta receta){
        boolean noHayIngrediente = false;
        for (int i = 0; i < cocina.getIngredienteCocina().length; i++){
            boolean encontroIngrediente = false; //me confunden un poco esta variable porque no puedo usarla afuera?
            int cantidadFaltante = 0;
            for (int j = 0; j < receta.getIngrediente().length && !encontroIngrediente; j++){
                int cantidadCocina = cocina.getIngredienteCocina()[i].getCantidad();
                int cantidadReceta = receta.getIngrediente()[j].getCantidad();
                if (cocina.getIngredienteCocina()[i].getNombre().equals(receta.getIngrediente()[j].getNombre())){
                    if (cocina.getIngredienteCocina()[i].getMedida().equals(receta.getIngrediente()[j].getMedida())){                   
                        if (cantidadCocina >= cantidadReceta){
                                System.out.println("Hay Sueficiente Ingrediente " + receta.getIngrediente()[j].getNombre());
                                encontroIngrediente = true;
                                noHayIngrediente = true;
                            }
                    else{
                            cantidadFaltante = Math.abs(cantidadCocina - cantidadReceta); 
                            System.out.println("Se debe conseguir " + cantidadFaltante + " " + receta.getIngrediente()[j].getMedida() + " de " +  receta.getIngrediente()[j].getNombre());
                            noHayIngrediente = true;
                        }   
                    }else{
                        System.out.println("Hacer conversion");
                        noHayIngrediente = true;
                    }
                }
            }
        }if(noHayIngrediente == false){
            System.out.println("No se encontro ningun ingrediente de la receta en la cocina");
        }
            
    }
        
}