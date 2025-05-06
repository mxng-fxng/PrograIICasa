package UsoClases032;
import java.util.Random;
import stdlib.StdDraw;
import java.awt.Color;

public class Circulo {
    
    private double x;
    private double y;
    private double radio;

    Circulo (double x0, double y0, double radio0){ //constructor
        x = x0;
        y = y0;
        radio = radio0;
    }

    public String toString (){//visualizador
        return "Centro: (" + x + ", " + y + "), Radio:" + radio;
    }

    double distancia (Circulo c){//observador
        return Math.sqrt((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y));
    }

    double area (){//observador
        return Math.PI*(radio*radio);
    }

    void mover (double dx, double dy){//modificador
        x += dx;
        y += dy;
    }

    double radio (){//observador
        return radio;
    }
    
    Punto centro (){//observador
        return new Punto(x,y);
    }
    
    /**
    * Pinta un circulo de radio r a base de pintar m puntos
    * aleatorios en un cuadrado {-n..n} en Color c
    */
    static void pintarCirculo (int m, int n, double r, Color c){

    }
    /**
    * POST:
    * resultado: p esta dentro o sobre un circulo de centro
    * (0, 0) y radio r
    */
    static boolean estaEnCirculo (Punto p, double r){
        
    }

    /** Pinta el circulo c con color */
    static void pintar (Circulo c, Color color)
    /** POST: resultado: un Color aleatorio */
    static Color colorAlea ()
    /** POST: resultado: un Circulo con centro aleatorio en {-D..D}
    * y radio aleatorio en {0..RADIO_MAX} */
    static Circulo circuloAlea ()
    /** Pinta n circulos con centros aleatorios en {-D..D}, radios
    * aleatorios en {0..RADIO_MAX} y con colores aleatorios */
    static void dibujarCirculos (int n)
}
