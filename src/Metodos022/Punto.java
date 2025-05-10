package Metodos022;

public class Punto {

    //Atributos
    private double x;
    private double y;

    //Constructor
    public Punto(double x0,double y0){
        x = x0;
        y = y0;
    }

    public Punto(){
        x = 0;
        y = 0;
    }

    //Visualizador
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    //Observador
    /**
     * En los observadores hay datos implicitos, que son
     * los del objeto sobre el que se aplica. En este caso 
     * x e y son del Punto p sobre el que se aplica el observador...
     */
    public double distancia(Punto q){
        return Math.sqrt((x-q.x)*(x-q.x)+(y-q.y)*(y-q.y));
    }

    public boolean equals (Object o){ //Método de objeto
        Punto aux= (Punto)o;//casting, para transformar el objeto tipo Object a tipo Punto
        return x == aux.x && y == aux.y;
    }

    //Ejecución
    public static void main(String[] args) {
        Punto origen = new Punto();
        Punto uno = new Punto(1, 1);
        double dist = origen.distancia(uno);
        System.out.println(dist);
    }

}
