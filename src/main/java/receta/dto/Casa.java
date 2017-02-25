package receta.dto;

import java.io.Serializable;

/**
 * Created by jpramire on 2/25/17.
 */
public class Casa implements Serializable {
    private String direccion;


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
