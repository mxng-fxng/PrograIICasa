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
    static void pintarCirculo (int m, int n, double r, Color c){//bien
        StdDraw.setScale(-n,n); //Tamaño del lienzo
        StdDraw.setPenColor(c);//color del lapiz
        StdDraw.setPenRadius(0.05);//tamaño del lapiz
        int i = 0;
        while (i < m) {
            Punto p = PuntoOps.puntoRandom(n);
            StdDraw.circle(p.getX(), p.getY(), r);//Dibuja el circulo
            i++;
        }
    }

    /**
    * POST:
    * resultado: p esta dentro o sobre un circulo de centro
    * (0, 0) y radio r
    * La fórmula matemática para determinar si un punto (x,y) está dentro o sobre un círculo con centro en (0,0) y radio r es: x² + y² ≤ r²
    */
    static boolean estaEnCirculo (Punto p, double r){//bien
        double distanciaCuadrado = p.getX() * p.getX() + p.getY() * p.getY();
        return distanciaCuadrado <= r * r;
    }

    /** Pinta el circulo c con color */
    static void pintar (Circulo c, Color color){//bien
        StdDraw.setScale(-10,10); //Tamaño del lienzo
        StdDraw.setPenColor(color);//color del lapiz
        StdDraw.setPenRadius(0.05);//tamaño del lapiz
        StdDraw.circle(c.x, c.y, c.radio);//Dibuja el circulo
    }

    /** POST: resultado: un Color aleatorio */
    static Color colorAlea(){//bien
        Random random = new Random(); //inicialiar el randomizador
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g,b); //tiene que devolver un objeto tipo Color
    }
    
    /** POST: resultado: un Circulo con centro aleatorio en {-D..D}
    * y radio aleatorio en {0..RADIO_MAX} */
    static Circulo circuloAlea (){//bien
        Random random = new Random(); //inicialiar el randomizador
        double x = random.nextDouble(10);
        double y = random.nextDouble(10);
        double radio = random.nextDouble(5);
        return new Circulo(x, y, radio);
    }

    /** Pinta n circulos con centros aleatorios en {-D..D}, radios
    * aleatorios en {0..RADIO_MAX} y con colores aleatorios */
    static void dibujarCirculos (int n){//bien
        pintarCirculo(n,10,n, colorAlea());
    }

    public static void main (String [] args){
        //pintar(circuloAlea(), colorAlea());
        System.out.println(estaEnCirculo(new Punto(4, 7), 5));//false
        System.out.println(estaEnCirculo(new Punto(3, 3), 5));//true
        //pintarCirculo(5, 10, 5, colorAlea());
        dibujarCirculos(7);
    }
}
