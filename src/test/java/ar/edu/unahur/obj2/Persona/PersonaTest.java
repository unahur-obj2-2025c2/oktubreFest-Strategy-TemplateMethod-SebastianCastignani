package ar.edu.unahur.obj2.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Jarra.Jarra;
import ar.edu.unahur.obj2.Nacionalidad.Aleman;
import ar.edu.unahur.obj2.Nacionalidad.Nacionalidad;
import ar.edu.unahur.obj2.cerveza.Marca;
import ar.edu.unahur.obj2.cerveza.Rubia;


/*Se pide codificación completa y test para los siguientes requerimientos:

Saber el contenido de alcohol de una jarra de cerveza. 
Ej: una jarra de cerveza de medio litro de la marca Hofbräu (suponiendo que tiene 8 % de graduación alcohólica) tiene 0.5 * 0.08 = 0.04 litros de alcohol.

Saber el total de alcohol que ingirió una persona (en base a las jarras de cerveza que compró).

Saber si una persona está ebria o no.

Saber si a una persona le gusta, o no, una determinada marca de cerveza. */
public class PersonaTest {

    private static final Nacionalidad Aleman = new Aleman();
    Marca hof = new Rubia(5.0, "Alemania", 8.0);
    Jarra jarra = new Jarra(0.5, hof); 
    Jarra jarra2 = new Jarra(0.5, hof);

    @Test
    void contenidoAlcoholJarra() {
        assertEquals(0.04, jarra.contenidoAlcohol());
    }

    Persona persona1 = new Persona(70.0,false,3.0,Aleman);

    @Test
    void cantidadDeLitrosDeAlcohol() {
        persona1.comprarJarra(jarra); 
        persona1.comprarJarra(jarra2); 
        assertEquals(1.0, persona1.canatidadDeLitrosDeAlcohol());

    }


    @Test
    void personaEbria() {
        persona1.comprarJarra(jarra); 
        persona1.comprarJarra(jarra2); 
        assertEquals(true, persona1.estaEbria());

    }

    @Test
    void leGustaLaMarca() {
        assertEquals(true, persona1.leGustaLaMarca(hof));
    }



}
