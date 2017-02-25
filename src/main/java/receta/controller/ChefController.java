package receta.controller;


import org.springframework.web.bind.annotation.*;
import receta.dto.Casa;

@RestController
    @RequestMapping(value = "/chef")
public class ChefController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/meLlamo/{nombre}")
    public String indexDos(@PathVariable String nombre) {
        return "Me llamo " + nombre;
    }


    @RequestMapping( value="/registrarCasa" , method = RequestMethod.POST)
    public Casa imprimirCasa(@RequestBody Casa casa) {
        casa.setDireccion(casa.getDireccion()+"REGISTRADA");
        return casa;
    }

    @RequestMapping("/casa")
    public Casa imprimirCasaTres() {
        Casa casa = new Casa();
        casa.setDireccion("LaMota");
        return casa;
    }


}