/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;

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
    
    public void setUsar(int cantidad, String medida){
        this.setCantidad(cantidad);
        this.setMedida(medida);
        
    }
}
