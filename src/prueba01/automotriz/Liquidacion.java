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
public class Liquidacion {
    private Integer liqSueldo;
    private String liqDia;
    private String liqMes;
    private String liqAnno;
    private Empleado liqEmpleado;

    public Liquidacion(Integer sueldo, String dia, String mes, String anno, Empleado emp) {
        this.liqSueldo = sueldo;
        this.liqDia = dia;
        this.liqMes = mes;
        this.liqAnno = anno;
        this.liqEmpleado = emp;
    }

    public Integer descuentoAfp(int afpPorcentaje){
        Integer resultado;
        resultado=this.liqSueldo*afpPorcentaje/100;
        return resultado;
    }
    
    public Integer descuentoSalud(Integer isaprePorcentaje){
        Integer resultado;
        resultado=this.liqSueldo*isaprePorcentaje/100;
        return resultado;
    }
    
    @Override
    public String toString() {
        return "\tSueldo : "+this.liqSueldo+
                "\n\tFecha Liquidacion : "+this.liqDia+"/"+this.liqMes+"/"+this.liqAnno+
                "\n"+this.liqEmpleado.toString();
    }
}
