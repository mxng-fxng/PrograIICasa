package Interfaces08;

/**
 * Clase Par es accesible desde el paquete porque no pone nada
 * Esta clase maneja variables genéricas por lo que puede usar cualquier 
 * tipo de objetos
 * Tipo1 y Tipo2 son solo identificadores para llamar a cada variable genérica
 */
class Par <Tipo1, Tipo2> {
    //atributos
    private Tipo1 uno;
    private Tipo2 otro;

    //procedimiento? (metodo)
    void add (Tipo1 e1, Tipo2 e2){
        uno = e1;
        otro = e2;
    }

    //visualizadores
    Tipo1 uno(){
        return uno;
    }

    Tipo2 otro(){
        return otro;
    }

    public static void main (String[] args){
        Par<Integer, Double> par = new Par<Integer, Double>();
        par.add(10, 12.3);
        System.out.printf("%d %5.2f\n", par.uno(), par.otro());
    }
}
