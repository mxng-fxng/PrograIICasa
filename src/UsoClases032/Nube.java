package UsoClases032;

import java.util.Random;
import stdlib.StdDraw;
import java.awt.Color;

public class Nube {
    /**
    * Pinta m puntos aleatorios en un cuadrado {-n..n} en Color c
    */
    static void pintarNube (int m, int n, Color c){
        Punto [] puntos = new Punto[m]; //importante poner el nombre del array
        StdDraw.setScale(-n,n); //Tamaño del lienzo
        StdDraw.setPenColor(c);//color del lapiz
        StdDraw.setPenRadius(0.05);//tamaño del lapiz
        for (int i = 0; i < puntos.length; i++){//cuenta atrás para generar m puntos
            puntos[i] = PuntoOps.puntoRandom(n-1);
            //VALE
            StdDraw.point(puntos[i].getX(), puntos[i].getY());//las coordenadas del punto 
        }
    }
 /**
  * Explicación línea puntos[i] = PuntoOps.puntoRandom(n);
  * Como la operación puntoRandom ES DE LA CLASE PuntoOps. Es una operación STATIC
  * hay que "llamar a la clase". Sin importar si la operación es public
  * Por eso se pone Clase.Metodo
  * a pesar de estar dentro del mismo paquete
  */

    public static void main (String [] args){
        pintarNube(20, 4, Color.BLUE);
    }
}
