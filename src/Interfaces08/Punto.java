package Interfaces08;

/**
 * Si pones "implements" pero no los metodos, dará error la clase
 * implements, indica como que esta clase tendrá los metodos de Ipunto (en este caso)
 * Implements, aparte de obligar a implementar todos los metodos de IPunto, obliga a que
 * los métodos (de IPunto) sean publicos (public)
 * La clase se relaciona con IPunto en algunos métodos (como distancia)
 */
class Punto implements IPunto  {
    private double x;
    private double y;

    Punto (double x0, double y0){
        x = x0;
        y = y0;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public boolean equals (Object o){
        Punto aux = (Punto)o;
        return x == aux.x && y == aux.y;
    }

    public double distancia (IPunto q){
        Punto aux = (Punto) q;
        return Math.sqrt((x-aux.x)*(x-aux.x)+(y-aux.y)*(y-aux.y));
    }

    public void mover (double dx, double dy){
        x += dx;
        y += dy;
    }

    public double x(){
        return x;
    }

    public double y(){
        return y;
    }
}
