/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.dto;

import receta.dto.def.Solido;

/**
 *
 * @author Evelyn-da
 */
public class FrutayVerdura extends Solido{
    private boolean contable;
    
    public FrutayVerdura(String tipoFrutayVerdura){
        super();
        this.setNombre(tipoFrutayVerdura);
    }            

    /**
     * @return the contable
     */
    public boolean isContable() {
        return contable;
    }

    /**
     * @param contable the contable to set
     */
    public void setContable(boolean contable) {
        this.contable = contable;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Contable: " +contable;
    }
    
}
