package UsoClases032;

/**No hace falta importar la clase Punto, porque está en el mismo paquete */

import stdlib.StdDraw;
import java.awt.Color;

public class PuntoOps {
    
    /**
    * POST:
    * resultado: punto medio del segmento que conecta p1 y p2
    */
    static Punto puntoMedio (Punto p1, Punto p2){ //está bien implementado
        double x = (p1.getX() + p2.getX())/2;
        double y = (p1.getY()+ p2.getY())/2;
        return new Punto(x, y);
    }

    public static void main (String [] args){
        Punto p = new Punto(1, 2);
        Punto q = new Punto(-2, -2);
        Punto m = puntoMedio(p, q);
        System.out.println(m.toString()); //Devuelve (-0.5, 0.0) está bien
        /** En las diapositivas esta puesto como
         * PuntoOps.puntoMedio(p,q); porque se ejecuta el metodo desde la consola
         * por eso pone: Clase.Metodo();
         */
        
         //dibujar puntos
         StdDraw.setScale(-10,10);
         StdDraw.setPenColor(Color.BLUE);
         StdDraw.setPenRadius(0.1);
         StdDraw.point(p.getX(), p.getY());
         StdDraw.clear(Color.BLACK);
         StdDraw.point(p.getX(), p.getY());
    }
}
