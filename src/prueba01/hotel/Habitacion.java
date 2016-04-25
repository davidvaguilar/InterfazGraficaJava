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
public class Habitacion {
    private String habNumero;
    private Long habDimension;
    private String habColor;
    private Huesped habHuesped;
    private FechaReserva habReserva;
    private Tipo habTipo;

    public void setHabHuesped(Huesped habHuesped) {
        this.habHuesped = habHuesped;
    }  

    public void setHabReserva(String dia, String mes, String anno) {
        this.habReserva = new FechaReserva(dia, mes, anno);
    }
    
    

    public Habitacion(String numero, Long dimension, String color, Tipo tipo) {
        this.habNumero = numero;
        this.habDimension = dimension;
        this.habColor = color;
        this.habTipo = tipo;
    }

    public class FechaReserva{
        private String fecRecDia;
        private String fecRecMes;
        private String fecRecAnno;

        public FechaReserva(String dia, String mes, String anno) {
            this.fecRecDia = dia;
            this.fecRecMes = mes;
            this.fecRecAnno = anno;
        }

        @Override
        public String toString() {
            return this.fecRecDia+"/"+this.fecRecMes+"/"+this.fecRecAnno;
        }
    }
    
    @Override
    public String toString() {
        return "\tHabitacion N° : "+this.habNumero+
                "\n\tDimensiones : "+this.habDimension+" mts2"+
                "\n\tColor de Habitacion : "+this.habColor+
                "\n\t"+habHuesped.toString()+
                "\n\tFecha Reserva : "+habReserva.toString()+
                "\n\t"+habTipo.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(getClass() == obj.getClass()) {
                Habitacion other = (Habitacion)obj;
                return(this.habNumero.equals(other.habNumero));
            }
        }
        return false ;  
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.habNumero);
        return hash;
    }
    
    
}
