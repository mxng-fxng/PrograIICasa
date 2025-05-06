package Inctercambio021;
import Objetos01.Punto3D;

public class Swap {
    static void swap (Punto3D p, Punto3D q){
        Punto3D t = p; //Objeto auxiliar para guardar el valor de p
        p = q; //se copia el valor de p en q
        q = t; //se copia el valor de t en q
    }

    /** Hay que usar una auxiliar para guardar el valor, ya que
     * si hacemos p = q y q = p, en los dos objetos estará el valor de p
     * pero si guardamos t = p, p = q y q = t sí se cambian los valores, de los objetos entrada
     */

    static void swapX (Punto3D p, Punto3D q){
        double t = p.x;
        p.x = q.x;
        q.x = t;
    }
    public static void main (String [] args){
        Punto3D p = new Punto3D(1,2,3);
        Punto3D q = new Punto3D(4,5,6);
        swap (p,q);
        swapX(p,q);
    }
}
