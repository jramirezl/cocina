/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.dto;

import receta.dto.def.Solido;
import java.util.Arrays;

/**
 *
 * @author Evelyn-da
 */
public class Carne extends Solido{
    private String parte;
    
    public Carne(String tipoCarne){
        super();
        this.setNombre(tipoCarne);
    }

    /**
     * @return the parte
     */
    public String getParte() {
        return parte;
    }

    /**
     * @param parte the parte to set
     */
    public void setParte(String parte) {
        this.parte = parte;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Parte: " +parte;
    }
}
