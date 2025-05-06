package UsoClases032;
import java.util.Random;
import stdlib.StdDraw;
import java.awt.Color;

public class PuntoMov {
    /**
    * Mueve p aleatoriamente en {-D..D}
    */
    public static void moverRandom (Punto p){
        Random random = new Random();//crea un generador de numeros aleatorios en java
        //Usamos el metodo de mover de la clase Punto para que no haya que hacerlo de nuevo
        //Reutilizamos métodos
        p.mover(random.nextDouble(2),random.nextDouble(2));

    }
    
    /**
    * Punto animado
    */
    static void animacion (Punto p){
        while (true){
            StdDraw.clear(StdDraw.CYAN);
            PuntoOps.pintar(p, Color.YELLOW);
            moverRandom(p);
            StdDraw.show();
            StdDraw.pause(100);
        }
    }
}
