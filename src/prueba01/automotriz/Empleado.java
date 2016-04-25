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
public class Empleado extends Persona{
    private FechaContratacion empFechaContratacion;

    public Empleado(String rut, String nombre, String dia, String mes, String anno) {
        super(rut, nombre, dia, mes, anno);
        this.empFechaContratacion = new FechaContratacion("24", "04", "2000");
    }

    public FechaContratacion getEmpFechaContratacion() {
        return empFechaContratacion;
    }
    

    @Override
    public String toString() {
        return super.toString()+
                "\n"+empFechaContratacion;
    }
    
    public class FechaContratacion{
        private String fecConDia;
        private String fecConMes;
        private String fecConAnno;

        public FechaContratacion(String dia, String mes, String anno) {
            this.fecConDia = dia;
            this.fecConMes = mes;
            this.fecConAnno = anno;
        }
        
        public String calcularAntiguedad(){
            Integer annoActual=2016;
            Integer antiguedad;
            antiguedad=annoActual-Integer.parseInt(this.fecConAnno);
            return antiguedad.toString();
        }

        @Override
        public String toString() {
            return "\tFecha de Contratacion : "+this.fecConDia+"/"+this.fecConMes+"/"+this.fecConAnno;
        }        
    }
    
    
}
