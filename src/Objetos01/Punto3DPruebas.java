package Objetos01;

public class Punto3DPruebas {
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
