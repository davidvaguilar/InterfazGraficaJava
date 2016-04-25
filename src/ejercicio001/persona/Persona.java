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
        String frase = "Hola, ";
        Integer intHora = Integer.parseInt(hora);
        if(intHora < 12){
            frase = frase + "Buenos Dias, ¿Como estas?";
        }else{
            if(intHora < 20){
                frase = frase + "Buenas Tardes, ¿Como te ha ido?";
            }else{
                frase = frase + "Buenas Noches, ¿Que tal estuvo tu dia?";
            }
        }
        return frase;
    }
    
    public String presentarse(){
        return this.toString();
    }
    
    public String despedirse(String hora){
        String frase = "Adios, ";
        Integer intHora = Integer.parseInt(hora);
        if(intHora < 12){
            frase = frase + "que tenga un buen dia";
        }else{
            if(intHora < 20){
                frase = frase + "que tenga una bonita tarde";
            }else{
                frase = frase + "que tenga una buena noche.";
            }
        }     
        return frase;
    }
    
    @Override
    public String toString() {
        return ("Rut : "+ this.perRut+
                "\nNombre : "+this.perNombre+
                "\nApellidos : "+this.perApellidoPaterno+" "+ this.perApellidoMaterno);
    }
    
    
}
