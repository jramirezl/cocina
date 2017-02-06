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
        int x;
        //se va oviar la conversion de medidas queda pendiente para una futura version
        //Por ejempo si se necesita one cup etc
        if(this.getCantidad() > ingrediente.getCantidad()){ 
            System.out.println("Cantidad1 " + this.getCantidad());
            System.out.println("Cantidad2 " + ingrediente.getCantidad());
            if(this.getMedida().equals(ingrediente.getMedida())){
                System.out.println("Medida1 " + this.getMedida());
                System.out.println("Medida2 " + ingrediente.getMedida());
                x=this.getCantidad() - ingrediente.getCantidad();
                this.setCantidad(this.getCantidad() - ingrediente.getCantidad());
                System.out.println("x"+x+"cantidad nueva"+this.getCantidad());
                System.out.println("nombre"+this.getNombre());
            }else{
                System.out.println("se debe hacer una conversion-Liquido");
            }
            //System.out.println("no hay inventario suficiente-Liquido");  
        }
    }
    
}
