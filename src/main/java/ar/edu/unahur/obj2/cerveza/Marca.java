package ar.edu.unahur.obj2.cerveza;

public abstract  class Marca {
    private final Double contenidoDeLupudo;
    private final String pais;


    public Marca(Double contenidoDeLupudo, String pais) {
        this.contenidoDeLupudo = contenidoDeLupudo;
        this.pais = pais;
    }

    public abstract Double graduacionDeAlcohol();



    public Double getContenidoDeLupudo() {
        return this.contenidoDeLupudo;
    }

    public String getPais() {
        return this.pais;
    }

}
