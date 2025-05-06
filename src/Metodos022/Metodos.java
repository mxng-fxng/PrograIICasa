package Metodos022;

public class Metodos {
//PUNTO3D.JAVA
/**
 * implementación correcta de Punto3D pero 
 * en lugar de poner Punto3D pondre Metodos 
 * para que no de error y así no tenga dos 
 * ficheros repetidos. Y así están bien 
 * distinguidos por presentación
 */ 

//Los ATRIBUTOS de las clases deben estar en private, ocultos a otras clases
    private double x;
    private double y;
    private double z;

//El CONSTRUCTOR está en public, si no, no se podrían crear objetos nuevos
    public Metodos(double x0, double y0, double z0){
        x = x0;
        y = y0;
        z = z0;
    }
//constructor sin argumentos, pone el valor default
    public Metodos(){
        x = 0;
        y = 0;
        z = 0;
    }

//El resto de métodos están en public, son operaciones a las que se pueden acceder
    public String toString(){
        return "(" + x +", " + y + ", " + z + ")";
    }

//OBSERVADOR: forma correcta de ver el valor de un atributo (private)
//Los observadores SI DEVUELVEN ALGO (tipo)
    public double getX(){ 
        return x;
    }
/**
* POST: resultado: la distancia euclídea de este Punto3D a q
*/
//Se pueden usar directamente los atributos, sin getX, getY... porque estamos dentro de la misma clase
    public double distancia (Metodos q){
        return Math.sqrt((x-q.x)*(x-q.x)+(y-q.y)*(y-q.y)+(z-q.z)*(z-q.z));
    }

    public Metodos copia2D (){
        return new Metodos(this.x, this.y, 0);
    }

//MODIFICADOR: forma correcta de cambiar el valor de un atributo (private)
//los modificadores NO DEVUELVEN NADA. (void)
    public void setX(double x0){
        x = x0;
    }

    public static void main (String [] args){
        Metodos p = new Metodos(1, 2, 3);
        System.out.println(p.toString());
        p.setX(50); //cambia el atributo x
        System.out.println(p.toString());

        Metodos p2 = new Metodos();
        Metodos q = p2; //dos punteros para el mismo objeto
        p2.setX(5.6);
        q.setX(7.4); //El punto se queda con este valor (7.4 , 0, 0)
        System.out.println(p2.toString());

        Metodos p3 = p.copia2D();
        System.out.println(p3.toString()); //devuelve (50, 2, 0) solo x y

    }
}
