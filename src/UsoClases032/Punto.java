package UsoClases032;

public class Punto {
    //atributos
    private double x;
    private double y;

    //constructor
    Punto (double x0,double y0){
        x = x0;
        y = y0;
    }

    //Más corto que x=0, y=0. Donde this hace referencia al objeto propio
    Punto(){
        this (0,0);
    }
    
    //visualizador
    public String toString (){
        return "(" + x + ", " + y + ")";
    }

    //observadores, devuelven algo
    /**
     * Equals: si es igual o no los objetos
     * compara el objeto sobre el que se aplica el metodo
     * con el objeto o
     * Se hace uso de la clase Object (objeto de tipo Object)
     * Punto q = (Punto)o; Realiza un Casting, CONVERSIÓN, del objeto o
     * de tipo Objet al tipo Punto
     * Los tipo Object se pueden convertir a cualquier tipo de objeto
     * El objeto o conertido a tipo Punto se guarda en el punto q
     * Luego el punto q es comparado con el que se aplica el metodo
     */
    public boolean equals (Object o){
        Punto q = (Punto)o; //variable tipo Punto auxiliar
        return x == q.x && y == q.y;
    }

    double getX (){
        return x;
    }

    double getY (){
        return y;
    }

    //modificador, no devuelve nada
    void mover (double dx, double dy){
        x += dx;
        y += dy;
    }

    public double distancia(Punto q){
        return Math.sqrt((x-q.x)*(x-q.x)+(y-q.y)*(y-q.y));
    }


    //ejecución
    public static void main (String [] args){
        Punto p0 = new Punto();
        Punto p1 = new Punto(1, 1);
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p0.getX());
        System.out.println(p1.getX());
        System.out.println(p0 == p1);//False porque no APUTAN al mismo OBJETO
        System.out.println(p0.equals(p1));//False porque no TIENEN los mismos VALORES
        System.out.println(p0.equals(new Punto()));//True tienen los mismos valores
        System.out.println(p0 == new Punto());//False porque no apuntan al mismo objeto
        Punto p2 = p1;
        System.out.println(p2 == p1);//True porque son dos etiquetas que se refieren al MISMO OBJETO


    }
}
