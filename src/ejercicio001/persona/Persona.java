/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio001.persona;

/**
 *
 * @author David
 */
public class Persona {
    private String perRut;
    private String perNombre;
    private String perApellidoPaterno;
    private String perApellidoMaterno;

    public Persona(String perRut, String perNombre, String perApellidoPaterno, String perApellidoMaterno) {
        this.perRut = perRut;
        this.perNombre = perNombre;
        this.perApellidoPaterno = perApellidoPaterno;
        this.perApellidoMaterno = perApellidoMaterno;
    }

    public String saludar(String hora){
        String saludo="Hola, ";
        if(Integer.parseInt(hora)<12){
            saludo=saludo+"Buenos Dias, ";
        }else{
            if(Integer.parseInt(hora)<20){
                saludo=saludo+"Buenas Tardes, ";
            }else{
                saludo=saludo+"Buenas Noches, ";
            }
        }
        saludo=saludo+"como estas?";
        return saludo;
    }
    
    public String presentarse(){
        return this.toString();
    }
    
    public String despedirse(String hora){
        String despedida="Adios, ";
        if(Integer.parseInt(hora)<12){
            despedida=despedida+"que tenga un buen dia";
        }else{
            if(Integer.parseInt(hora)<20){
                despedida=despedida+"que tenga una bonita tarde";
            }else{
                despedida=despedida+"que tenga una buena noche.";
            }
        }     
        
        return despedida;
    }
    
    @Override
    public String toString() {
        return "Rut : "+ this.perRut+
                "\nNombre : "+this.perNombre+
                "\nApellidos : "+this.perApellidoPaterno+" "+ this.perApellidoMaterno;
    }
    
    
}
