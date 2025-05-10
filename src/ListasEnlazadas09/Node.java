package ListasEnlazadas09;

/**
 * La clase Node es una clase que maneja una variable genérica E
 * por lo que puede manejar cualquier tipo de objetos
 */
    class Node <E> {
    //Atributos
    E elemento; //atributo de cualquier tipo
    Node <E> siguiente; //Atributo del mismo tipo de la clase, que será el siguiente nodo. 
    //por eso es un dato RECURSIVO. Porque se tiene a él mismo como atributo

    //Constructor
    //Lista enlazada es recursiva, porque se llama a sí misma en el constructor
    Node (E e, Node <E> sig){
        elemento = e;
        siguiente = sig;
    }

    //visualizador solo de enteros
    static String toString (Node<Integer> lista){
        Node<Integer> aux = lista; //variable lista auxiliar
        String s = "";
        while (aux != null) //mientras la lista no sea vacia
        {
        s += aux.elemento + " "; //Añade al String el elemento de la lista
        aux = aux.siguiente; //avanza al siguiente elemento de la lista.
        /**
         * crea una lista nueva, porque borra el nodo añadido a String
         */
        }
        return s;
    }

    static String toStringRec (Node<Integer> lista){ //Es el toString pero recursivo, que se llama a sí mismo
        if (lista == null) //Si la llista es vacía
        return "";
        else
        return lista.elemento + " " + toStringRec(lista.siguiente);
    }
    
}
