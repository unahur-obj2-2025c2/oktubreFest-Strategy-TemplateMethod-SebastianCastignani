package ar.edu.unahur.obj2.cerveza;

import ar.edu.unahur.obj2.Reglamentacion;

public class Negra extends Marca{


    public Negra(Double contenidoDeLupudo, String pais, Double graduacionDeAlcohol) {
        super(contenidoDeLupudo, pais);
    }

    @Override
    public Double graduacionDeAlcohol() {
        return Math.min(Reglamentacion.getInstance().getGraduacionCervezaNegra(), this.getContenidoDeLupudo());
    }


   



}
