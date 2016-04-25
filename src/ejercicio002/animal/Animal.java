/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio002.animal;

import java.util.Objects;

/**
 *
 * @author David
 */
public class Animal {
    private String aniCodigo;
    private String aniNombre;
    private String aniEspecie;
    private String aniTipo;
    private Double aniAltura;
    private Double aniPeso;

    public Animal(String codigo, String nombre, String especie, String tipo, Double altura, Double peso) {
        this.aniCodigo = codigo;
        this.aniNombre = nombre;
        this.aniEspecie = especie;
        this.aniTipo = tipo;
        this.aniAltura = altura;
        this.aniPeso = peso;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(getClass() == obj.getClass()) {
                Animal other = (Animal)obj;
                if(this.aniCodigo.equals(other.aniCodigo)){
                    return true;
                }
            }
        }
        return false ;  
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.aniCodigo);
        return hash;
    }
    
    public boolean esGrande(){
        if(this.aniAltura>=1.5){
            return (true);
        }else{
            return (false);
        }
    }
    
    public boolean esPesado(){
        if(this.aniPeso>=50.0){
            return (true);
        }else{
            return (false);
        }   
    }
    
    @Override
    public String toString() {
        return ("Codigo: "+aniCodigo+
                "\nNombre: "+aniNombre+
                "\nEspecie: "+aniEspecie+
                "\nTipo: "+aniTipo+
                "\nAltura: "+aniAltura+
                "\nPeso: "+aniPeso);
    }
    
    
    
}
