package Objetos01;

import java.util.Arrays;

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

    //EJECUTABLE (no se pone en la clase, se hace otro fichero)
    public static void main (String [] args) { //importante poner esto para que se pueda ejecutar
        Personaje tales = new Personaje("Tales", "Mileto", 10);
        System.out.println(tales);

        Personaje solon = new Personaje("Solon", "Atenas", 30);
        Personaje bias = new Personaje("Bias", "Priene", 40);
        Personaje[] lista_personajes = {tales, solon, bias};//Array de objetos
        for (Personaje p: lista_personajes) System.out.println(p); //Bucle que recorre el array para cada elemento
        System.out.println(Arrays.toString(lista_personajes));
    }
}
