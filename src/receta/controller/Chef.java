/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.controller;

import receta.dto.Cocina;
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
                    System.out.println("i"+ingredientesReceta[i].getNombre());
                    System.out.println("j"+ingredientesCocina[j].getNombre());
                    ingredientesReceta[i].usarIngrediente(ingredientesCocina[j]);
            }
        }
    }
    
    public double valorReceta(Receta[] recetas,String nombreReceta){
        double valor1 = 0;
        double valor2 = 1;
        for (int i = 0; i < recetas.length; i++){
            System.out.println("nombre " + recetas[i].getNombre());
            if(recetas[i].getNombre().equals(nombreReceta)){
                for (int j = 0; j < recetas[i].getIngrediente().length;j++){
                    valor1 += recetas[i].getIngrediente()[j].getValor()* recetas[i].getIngrediente()[j].getCantidad(); //No logro capturar la cantidad real, ideas?
                    System.out.println("valorA2 "+valor1+" "+valor2 + " " + recetas[i].getIngrediente()[j].getNombre());
                }
            }
        }
        System.out.println("valor2 "+valor1);
        return valor1;
    }
}
