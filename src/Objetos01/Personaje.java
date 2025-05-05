package Objetos01;

class Personaje {
    //ATRIBUTOS
    String nombre;
    String ciudad;
    int puntos;

    //CONSTRUCTOR
    Personaje (String nom, String ciu, int pt){
        nombre = nom;
        ciudad = ciu;
        puntos = pt;
    }

    //VISUALIZADOR
    public String toString(){
        return nombre + " de " + ciudad + ": " + puntos;
    }
}
