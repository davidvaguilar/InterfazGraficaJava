/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio004.ninno;

/**
 *
 * @author David
 */
public class Ninno {
    private String ninRut;
    private String ninNombre;
    private String ninApellidoPaterno;
    private String ninApellidoMaterno;
    private Integer ninEdad;

    public Ninno(String rut, String nombre, String apePaterno, String apeMaterno, Integer edad) {
        this.ninRut = rut;
        this.ninNombre = nombre;
        this.ninApellidoPaterno = apePaterno;
        this.ninApellidoMaterno = apeMaterno;
        this.ninEdad = edad;
    }

    @Override
    public String toString() {
        return "Datos del Menor"+
                "\nRut : "+this.ninRut+
                "\nNombre Completo : "+this.ninNombre+" "+this.ninApellidoPaterno+" "+this.ninApellidoMaterno+
                "\nEdad : "+this.ninEdad;
    }
    
    public Boolean esNinno(){
        if(this.ninEdad > 17){
            return false;
        }else
            return true;
    }
    
    public String presentarse (){
        return "Hola, me llamo "+this.ninNombre+" "+this.ninApellidoPaterno+" "+this.ninApellidoMaterno+
                "que tengas un buen dia";
    }
    
    public String añoEscolaridad(){
        switch(this.ninEdad){
            case 5:
                return "El niño esta en Kinder";
            case 6:
                return "El niño esta en 1ero Basico";
            case 7:
                return "El niño esta en 2do Basico";
            case 8:
                return "El niño esta en 3ero Basico";
            case 9:
                return "El niño esta en 4ero Basico";
            case 10:
                return "El niño esta en 5ero Basico";
            case 11:
                return "El niño esta en 6ero Basico";
            case 12:
                return "El niño esta en 7ero Basico";
            case 13:
                return "El niño esta en 8ero Basico";
            case 14:
                return "El niño esta en 1ero Medio";
            case 15:
                return "El niño esta en 2do Medio";
            case 16:
                return "El niño esta en 3ero Medio";
            case 17:
                return "El niño esta en 4to Medio";                    
        }
        return "El ninno no tiene escolaridad";        
    }    
}
