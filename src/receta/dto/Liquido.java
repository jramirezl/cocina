/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.dto;

import receta.dto.def.Ingrediente;

/**
 *
 * @author Evelyn-da
 */
public class Liquido extends Ingrediente{
    
    public Liquido(String tipoLiquido){
        super();
        this.setNombre(tipoLiquido);
    }
    
    @Override
    public void usarIngrediente(int cantidad, String medida){
        //se va oviar la conversion de medidas queda pendiente para una futura version
        //Por ejempo si se necesita one cup etc
        if(this.getCantidad() > cantidad){ 
            if(this.getMedida().equals(medida)){
                this.setCantidad(this.getCantidad()- cantidad);
            }else{
                System.out.println("se debe hacer una conversion");
            }
            System.out.println("no hay inventario suficiente");  
        }
    }
    
}
