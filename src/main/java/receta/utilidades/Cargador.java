/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta.utilidades;

import receta.dto.Cocina;
import receta.dto.Receta;

/**
 *
 * @author Evelyn-da
 */
public interface Cargador{
    Cocina[] cargarCocinas();
    Receta[] cargarRecetas();
}
