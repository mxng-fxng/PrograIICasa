package Conceptos05;

public class Empleado {
    //atributos
    private String nombre;
    private String dni;
    private static int numEmpleados; // atributo, privado DE CLASE

    Empleado (String nom, String numDni){
        nombre = nom;
        dni = numDni;
        numEmpleados += 1;
    }

    Empleado (String nom){ //constructor en el que no se da el dni
        this(nom,""); //por eso se llama al otro constructor. sobre This (este) objeto
    }

    public String toString (){ //metodo de Objeto porque no pone static
        return "Empleado: " + nombre + " - DNI: " + dni;
    }

    static int numEmpleados (){ //metodo de Clase porque pone static
        return numEmpleados;
    }

    public static void main (String [] args){
        Empleado emp1 = new Empleado("Juan");
        System.out.println(emp1.toString());//metodo de objeto por eso se pone emp1 (el objeto)
        System.out.println(Empleado.numEmpleados()); //1 Metodo de clase por eso se pone Empleado

        Empleado emp2 = new Empleado("Pepe");
        System.out.println(emp2); //en el toString no hace falta poner toString, se da por entendido que lo llamas para imprimirlo
        System.out.println(Empleado.numEmpleados());//2

        Empleado p = new Empleado("Perez", "3562");
        System.out.println("p = " + p);
        System.out.println("Empleado.numEmpleados() = " + Empleado.numEmpleados());
        Empleado f = new Empleado("Fernandez", "2312");
        System.out.println("f = " + f);
        System.out.println("Empleado.numEmpleados() = " + Empleado.numEmpleados());
    }
}
