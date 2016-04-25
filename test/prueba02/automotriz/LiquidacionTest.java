/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba02.automotriz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import prueba01.automotriz.Empleado;
import prueba01.automotriz.Liquidacion;

/**
 *
 * @author David
 */
public class LiquidacionTest {
    Liquidacion liquidacion;
    Empleado empleado01;
    
    public LiquidacionTest() {
    }
    
    
    
    @Test
    public void descuentoAfpMethod() {
        int afp;
        afp=12;
        assertEquals(3000, liquidacion.descuentoAfp( afp ),0.0);
    }
    
    @Test
    public void descuentoSaludMethod() {
        Integer isapre;
        isapre = 7;
        assertEquals(3000, liquidacion.descuentoSalud( isapre ),0.0);
    }
    
    @Test
    public void antiguedadMethod() {
        assertEquals("15", empleado01.getEmpFechaContratacion().calcularAntiguedad(),0.0);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String rut,nombre,dia,mes,anno;
        Integer sueldo;
        System.out.println("REGISTRO DE EMPLEADO");
        System.out.println("--------------------");
        System.out.println("Ingresar el Rut");
        rut = "15979446-6";
        System.out.println("Ingrese el Nombre");
        nombre = "David";
        System.out.println("Ingresar el dia de Nacimiento");
        dia = "26";
        System.out.println("Ingresar el mes de Nacimiento");
        mes = "11";
        System.out.println("Ingresar el año de Nacimiento");
        anno = "1984";
        empleado01=new Empleado(rut, nombre, dia, mes, anno);
        System.out.println("REGISTRO DE LIQUIDACION DE SUELDO");
        System.out.println("---------------------------------");
        System.out.println("\tLos datos del empleado\n"+empleado01.toString());
        System.out.println("Ingresar el sueldo del empleado");
        sueldo = 300000;
        System.out.println("Ingrese dia Liquidacion");
        dia="31";
        System.out.println("Ingrese mes Liquidacion");
        mes="03";
        System.out.println("Ingrese Anno Liquidacion");
        anno="1984";
        liquidacion=new Liquidacion(sueldo, dia, mes, anno, empleado01);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
