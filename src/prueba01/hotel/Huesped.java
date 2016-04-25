/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba01.hotel;

import java.util.Objects;

/**
 *
 * @author David
 */
public class Huesped {
    private String hueRut;
    private String hueNombre;
    private String hueNacionalidad;

    public Huesped(String rut, String nombre, String nacionalidad) {
        this.hueRut = rut;
        this.hueNombre = nombre;
        this.hueNacionalidad = nacionalidad;
    }

    public Boolean realizarReserva(Habitacion habitacion){
        habitacion.setHabHuesped(this);
        habitacion.setHabReserva("24", "03", "2016");
        return true;
    }
    
    @Override
    public String toString() {
        return "\tRut : "+this.hueRut+
                "\n\tNombre : "+this.hueNombre+
                "\n\tNacionalidad : "+this.hueNacionalidad;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(getClass() == obj.getClass()) {
                Huesped other = (Huesped)obj;
                return(this.hueRut.equals(other.hueRut));
            }
        }
        return false;  
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.hueRut);
        return hash;
    }
    
    
}
