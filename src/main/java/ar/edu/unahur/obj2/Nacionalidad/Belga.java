package ar.edu.unahur.obj2.Nacionalidad;

import ar.edu.unahur.obj2.cerveza.Marca;

public class Belga extends Nacionalidad{

    @Override
    public Boolean leGustaLaMarca(Marca marca) {
        return marca.getContenidoDeLupudo() > 4;
    }

}
