package UsoClases032;

/**
 * Las coordenadas x, y, de los vértices inferior izquierdo y superior derecho como atributos
 * Un constructor
 * Un visualizador ( toString )
 * Un observador para calcular la distancia entre dos rectángulos 
 */
public class Rectangulo {
    private Punto infIzq;
    private Punto supDer;

    public Rectangulo(double xi, double yi, double xd, double yd){ //constructor bien
        infIzq = new Punto(xi, yi);
        supDer = new Punto(xd, yd);
    }

    public String toString(){//visualizador bien
        return "Coordenadas vértice inferior izquierdo: " +  infIzq + " Coordenadas vértice superior derecho: " + supDer ;
    }

    public double distancia(Rectangulo r){//observador
        double dx = Math.max(0, Math.max(this.infIzq.getX() - r.supDer.getX(), r.infIzq.getX() - this.supDer.getX()));
        double dy = Math.max(0, Math.max(this.infIzq.getY() - r.supDer.getY(),  r.infIzq.getY() - this.supDer.getY()));
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main (String [] args){
        System.out.println(new Rectangulo(2, 7, 9, 5).toString());
    }
}
