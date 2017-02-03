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
public class Condimento extends Solido{
    
    public Condimento(String tipoCondimento){
        super();
        this.setNombre(tipoCondimento);
    }
}
