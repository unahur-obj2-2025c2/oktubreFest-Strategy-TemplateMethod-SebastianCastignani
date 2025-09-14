package ar.edu.unahur.obj2.Jarra;

import ar.edu.unahur.obj2.cerveza.Marca;

public class Jarra {

    private final Double capacidad; 
    private final Marca marca;


    public Jarra(Double capacidad, Marca marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }


    public Double getLitros() {
        return capacidad;
    }


    public Marca getMarca() {
        return marca;
    }

    public Double contenidoAlcohol() {
        return (capacidad * marca.graduacionDeAlcohol()) / 100;
    }

}
