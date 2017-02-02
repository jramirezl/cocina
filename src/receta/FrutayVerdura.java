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
public class FrutayVerdura extends Solido{
    private boolean contable;
    
    public FrutayVerdura(){
        super();
        setNombre("FrutayVerdura");
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
    
}
