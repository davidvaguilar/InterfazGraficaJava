/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio003.triangulo;

/**
 *
 * @author David
 */
public class Triangulo {
    private String triCodigo;
    private String triColor;
    private Integer triBase;
    private Integer triAltura;

    public Triangulo(String codigo, String color, Integer base, Integer altura) {
        this.triCodigo = codigo;
        this.triColor = color;
        this.setTriBase(base);
        this.setTriAltura(altura);
        
    }

    public Integer getTriAltura() {
        return triAltura;
    }

    public Integer getTriBase() {
        return triBase;
    }

    public String getTriCodigo() {
        return triCodigo;
    }

    public String getTriColor() {
        return triColor;
    }

    
    public Integer area(){
        Integer resultado;
        resultado = this.triBase*this.triAltura/2;
        return resultado;
    }
    
    private void setTriAltura(Integer altura) {
        if(altura > 0)
            this.triAltura = altura;
        else
            this.triAltura=0;
    }

    private void setTriBase(Integer base) {
        if(base > 0 )
            this.triBase = base;
        else
            this.triBase = 0;
    }
    

    @Override
    public String toString() {
        return  "Este triangulo tiene: "+
                "\nEl Codigo : "+this.triCodigo+
                "\nsu Color : "+this.triColor+
                "\nla Base es : "+this.triBase+
                "\ny su Altura es: "+this.triAltura;
    }
    
    
    
    
     
}
