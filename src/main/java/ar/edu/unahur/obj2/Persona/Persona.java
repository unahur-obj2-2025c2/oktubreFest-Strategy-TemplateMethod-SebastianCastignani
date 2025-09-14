package ar.edu.unahur.obj2.Persona;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Jarra.Jarra;
import ar.edu.unahur.obj2.Nacionalidad.Nacionalidad;
import ar.edu.unahur.obj2.cerveza.Marca;


public class Persona {

    private final Double peso;
    private final Boolean leGustaMusicaTradicional;
    private final Double nivelDeAguante;
    private final Nacionalidad nacionalidad;
    private final List<Jarra> jarrasCompradas = new ArrayList<>();


    public Persona(Double peso, Boolean leGustaMusicaTradicional, Double nivelDeAguante, Nacionalidad nacionalidad) {
        this.peso = peso;
        this.leGustaMusicaTradicional = leGustaMusicaTradicional;
        this.nivelDeAguante = nivelDeAguante;
        this.nacionalidad = nacionalidad;
    }

    public Double getPeso() {
        return peso;
    }

    public Boolean getLeGustaMusicaTradicional() {
        return leGustaMusicaTradicional;
    }

    public Double getNivelDeAguante() {
        return nivelDeAguante;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public List<Jarra> getJarrasCompradas() {
        return jarrasCompradas;
    }


    public void comprarJarra(Jarra jarra){
        jarrasCompradas.add(jarra);
    }

    public Boolean  estaEbria(){
        return (this.canatidadDeLitrosDeAlcohol() * peso )> nivelDeAguante;
    }

    public Boolean leGustaLaMarca(Marca marca){
        return nacionalidad.leGustaLaMarca(marca);
    }

    public Double canatidadDeLitrosDeAlcohol(){
        return jarrasCompradas.stream().mapToDouble(j -> j.getLitros()).sum();
    }



    

}
