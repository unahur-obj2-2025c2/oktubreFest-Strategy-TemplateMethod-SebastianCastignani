package ar.edu.unahur.obj2.cerveza;

public class Rubia  extends Marca{

    private final Double graduacionDeAlcohol;


    public Rubia(Double contenidoDeLupudo, String pais, Double graduacionDeAlcohol) {
        super(contenidoDeLupudo, pais);
        this.graduacionDeAlcohol = graduacionDeAlcohol;
    }


    @Override
    public Double graduacionDeAlcohol() {
        return this.graduacionDeAlcohol;
    }

    

}
