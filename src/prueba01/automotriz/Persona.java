/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba01.automotriz;

/**
 *
 * @author David
 */
public class Persona {
    private String perRut;
    private String perNombre;
    private FechaNacimiento perFechaNacimiento;

    public Persona(String rut, String nombre, String dia, String mes, String anno) {
        this.perRut = rut;
        this.perNombre = nombre;
        this.perFechaNacimiento = new FechaNacimiento(dia,mes,anno);
    }
    
    public class FechaNacimiento{
        private String fecNacDia;
        private String fecNacMes;
        private String fecNacAnno;

        public FechaNacimiento(String dia, String mes, String anno) {
            this.fecNacDia = dia;
            this.fecNacMes = mes;
            this.fecNacAnno = anno;
        }

        public String calcularEdad(){
            Integer annoActual=2016;
            Integer edad;
            edad=annoActual-Integer.parseInt(this.fecNacAnno);
            return edad.toString();
        }
        
        @Override
        public String toString() {
            return "\tFecha de Nacimiento : "+this.fecNacDia+"/"+this.fecNacMes+"/"+this.fecNacAnno;
        }        
    }

    @Override
    public String toString() {
        return "\tRut : "+this.perRut+
                "\n\tNombre : "+this.perNombre+
                "\n"+this.perFechaNacimiento;
    }
}
