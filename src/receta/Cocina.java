/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receta;
import java.util.Arrays;
/**
 *
 * @author Evelyn-da
 */
public class Cocina {
    private String nombreCocina;
    private String ubicacionCocina;
    private String aliasCocina;
    private int cantidadIngCocina;
        //Practicar mas arrays//
    private Ingrediente [] ingCocina; 
    private int indiceIngCocina;
    
    public Cocina(int cantidadIngCocina){
        ingCocina = new Ingrediente[cantidadIngCocina];
    }
    
    public Ingrediente[] getIngrediente(){
        return ingCocina;
    }
    
    public void setIngrediente(Ingrediente[] ingCocina){
        this.ingCocina = ingCocina;
    }
    
    public void agregarIngCocina(Ingrediente ingCocina){
        this.getIngrediente()[this.indiceIngCocina] = ingCocina;
        indiceIngCocina++;
    }

    /**
     * @return the nombreCocina
     */
    public String getNombreCocina() {
        return nombreCocina;
    }

    /**
     * @param nombreCocina the nombreCocina to set
     */
    public void setNombreCocina(String nombreCocina) {
        this.nombreCocina = nombreCocina;
    }

    /**
     * @return the ubicacionCocina
     */
    public String getUbicacionCocina() {
        return ubicacionCocina;
    }

    /**
     * @param ubicacionCocina the ubicacionCocina to set
     */
    public void setUbicacionCocina(String ubicacionCocina) {
        this.ubicacionCocina = ubicacionCocina;
    }

    /**
     * @return the aliasCocina
     */
    public String getAliasCocina() {
        return aliasCocina;
    }

    /**
     * @param aliasCocina the aliasCocina to set
     */
    public void setAliasCocina(String aliasCocina) {
        this.aliasCocina = aliasCocina;
    }

    /**
     * @return the cantidadIngCocina
     */
    public int getCantidadIngCocina() {
        return cantidadIngCocina;
    }

    /**
     * @param cantidadIngCocina the cantidadIngCocina to set
     */
    public void setCantidadIngCocina(int cantidadIngCocina) {
        this.cantidadIngCocina = cantidadIngCocina;
    }

    /**
     * @return the ingredienteCocina
     */
    public Ingrediente[] getIngredienteCocina() {
        return ingCocina;
    }

    /**
     * @param ingredienteCocina the ingredienteCocina to set
     */
    public void setIngredienteCocina(Ingrediente[] ingredienteCocina) {
        this.ingCocina = ingredienteCocina;
    }
    
    @Override
    public String toString() {
        return "\nCocina: " + this.getNombreCocina()+
                "\nUbicacion: " + this.getUbicacionCocina()+
                "\nAlias: " + this.getAliasCocina()+
                "\nIngredientes: " + Arrays.toString(this.getIngrediente()); 
    }
    
}


