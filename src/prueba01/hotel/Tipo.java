/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba01.hotel;

/**
 *
 * @author David
 */
public enum Tipo {
    SINGLE(1,20000,"Habitacion para 1 Persona"),
    DOUBLE(1,30000,"Habitacion para 2 Personas"),
    TRIPLE(2,50000,"Habitacion para 3 Personas"),
    PENTHOUSE(3,80000,"Habitacion con vista a la Ciudad");
    
    private Integer tipCantidadBanno;
    private Integer tipValor;
    private String tipDescripcion;

    private Tipo(Integer tipCantidadBanno, Integer tipValor, String tipDescripcion) {
        this.tipCantidadBanno = tipCantidadBanno;
        this.tipValor = tipValor;
        this.tipDescripcion = tipDescripcion;
    }

    @Override
    public String toString() {
        return "\tNombre : "+this.name()+
                "\n\tCantidad Baños : "+this.tipCantidadBanno+
                "\n\tValor : "+this.tipValor+
                "\n\tDescripcion : "+this.tipDescripcion;     
    }
    
    public static String listar(){
        String lista;
        lista = "";
        for( Tipo r : Tipo.values() ){
                lista = lista + r.name()+" - ";
        }
        return (lista);
    }


}
