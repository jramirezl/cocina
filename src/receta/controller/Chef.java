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
                if (ingredientesReceta[i].getNombre().equals(ingredientesCocina[j].getNombre())){
                    ingredientesCocina[i].usarIngrediente(ingredientesReceta[j]);
                }
            }
        }
    }
    
    public double valorReceta(Receta[] recetas,String nombreReceta){
        double valorTotal = 0;
        
        for (int i = 0; i < recetas.length; i++){
            System.out.println("nombre " + recetas[i].getNombre());
            if(recetas[i].getNombre().equals(nombreReceta)){
                for (int j = 0; j < recetas[i].getIngrediente().length;j++){
                    Ingrediente ing = recetas[i].getIngrediente()[j];
                    double valor = ing.getValor();
                    int cantidad = ing.getCantidad();
                    valorTotal += ( valor * cantidad ); //No logro capturar la cantidad real, ideas?;
                }
            }
        }
        return valorTotal;
    }
}
