package UsoClases032;

/**No hace falta importar la clase Punto, porque está en el mismo paquete */

import stdlib.StdDraw;
import java.awt.Color;
import java.util.Random;

//Clase sin datos, compuesta únicamente por operaciones: Módulo funcional
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

    /**
    * Pinta el punto p con color c
    */
    public static void pintar (Punto p, Color c){
        StdDraw.setScale(-10,10); //Tamaño del lienzo
        StdDraw.setPenColor(c);//color del lapiz
        StdDraw.setPenRadius(0.1);//tamaño del lapiz
        StdDraw.point(p.getX(), p.getY());//las coordenadas del punto p
    }

    /**
    * POST: resultado: un Punto con x e y aleatorias en {-n..n}
    */

    //hace uso de Random, clase del paquete java.util
    public static Punto puntoRandom (int n){
        Random random = new Random();//crea un generador de numeros aleatorios en java
        //genera un numero entre 0 y n [0,n]
        double x = random.nextDouble(n);
        double y = random.nextDouble(n);
        return new Punto(x,y);
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
        pintar(p, Color.BLUE);
        System.out.println(puntoRandom(4).toString());//muestra por pantalla un punto aleatorio [0,4]
    }
}
