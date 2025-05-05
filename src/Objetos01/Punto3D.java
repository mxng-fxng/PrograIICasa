package Objetos01;

class Punto3D {
    //ATRIBUTOS
    double x; // coordenada x; sin restricciones
    double y; // coordenada y; sin restricciones
    double z;// coordenada z; sin restricciones

    //CONSTRUCTOR
    Punto3D (double x0, double y0, double z0){ 
        //Asigna cada valor de la entrada a los atributos del objeto
        x = x0;
        y = y0;
        z = z0;
    }

    //VISUALIZADOR
    public String toString (){
        return "(" + x + ", " + y + ", " + z + ")";
    }    
}

