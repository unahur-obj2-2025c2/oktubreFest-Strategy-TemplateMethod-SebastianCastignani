package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.Reglamentacion;

public class Roja extends Marca{

    public Roja(Double contenidoDeLupudo, String pais) {
        super(contenidoDeLupudo, pais);
    }

    @Override
    public Double graduacionDeAlcohol() {
        return Math.min(Reglamentacion.getInstance().getGraduacionCervezaNegra(), this.getContenidoDeLupudo()) * 1.25;
    }

}
