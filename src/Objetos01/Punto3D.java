package Objetos01;

public class Punto3D {
    //ATRIBUTOS
    //pongo la x public para usarla en swap. Pero de normal se ponen private
    public double x; // coordenada x; sin restricciones
    double y; // coordenada y; sin restricciones
    double z;// coordenada z; sin restricciones

    //CONSTRUCTOR
    //Tiene que ser public para poder usarlos en otro paquete (Swap.java)
    public Punto3D (double x0, double y0, double z0){ 
        //Asigna cada valor de la entrada a los atributos del objeto
        x = x0;
        y = y0;
        z = z0;
    }

    //VISUALIZADOR
    public String toString (){
        return "(" + x + ", " + y + ", " + z + ")";
    }    


    //EJECUTABLE (no se pone en la clase, se usa otro fichero)
    public static void main (String[]args){
        Punto3D p0 = new Punto3D (1,1,1); //crea un nuevo objeto de tipo Punto3D (de la clase Punto3D)
    
        Punto3D p1 = new Punto3D(1,2,3);
        Punto3D q1 = new Punto3D(3, 4, 5);
    
        Punto3D p2 = new Punto3D(0,0,0);
        Punto3D q2 = p2; //NO crea un nuevo objeto, esto hace que tanto desde p2 como desde q2 se pueda acceder al mismo objeto
        
        //COMANDOS EN CONSOLA:
        p2.x = 5;
        q2.x = 7; //este sería el valor final del punto
        System.out.println(p2.toString());
    }
}

