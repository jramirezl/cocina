/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.dto.def;

/**
 *
 * @author Evelyn-da
 */
public class Solido extends Ingrediente{
     private int peso;
     
    public Solido (){
        super();
    }
    
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public void usarIngrediente(Ingrediente ingrediente){ 
        //se va obviar la conversion de medidas queda pendiente para una futura version
        //Por ejempo si se necesita un TBS or TBSP de peper etc hay q convertir eso a peso
        if(this.getCantidad() > ingrediente.getCantidad()){ 
            if(this.getMedida().equals(ingrediente.getMedida())){
                this.setCantidad(this.getCantidad() - ingrediente.getCantidad());
            }else{
                System.out.println("se debe hacer una conversion-Solido");
            }
            System.out.println("No hay inventario suficiente - Solido");  
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + " Peso: " +peso;
    }

}
