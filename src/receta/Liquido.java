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
public class Liquido extends Ingrediente{
    
    public Liquido(String tipoLiquido){
        super();
        this.setNombre(tipoLiquido);
    }
    
    public void setUsar(int cantidad, String medida){
        this.setCantidad(cantidad);
        this.setMedida(medida);
    }
    
    @Override
    public String toString() {
        return "\n    *Nombre: " + this.getNombre()+
               "\n     Cantidad: " + this.getCantidad()+
               "\n     Medida: " + this.getMedida(); 
    }
}
