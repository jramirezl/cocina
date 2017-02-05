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
    public void usarIngrediente(Ingrediente ingrediente){
        //se va oviar la conversion de medidas queda pendiente para una futura version
        //Por ejempo si se necesita one cup etc
        if(this.getCantidad() > ingrediente.getCantidad()){ 
            if(this.getMedida().equals(ingrediente.getMedida())){
                this.setCantidad(this.getCantidad()- ingrediente.getCantidad());
            }else{
                System.out.println("se debe hacer una conversion");
            }
            System.out.println("no hay inventario suficiente");  
        }
    }
    
}
