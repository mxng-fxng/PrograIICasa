package Interfaces08;

/**
 * La clase de llama Caja y crea un nuevo tipo de variable llamado "Tipo"
 * La variable Tipo es genérica. Por lo que esta clase Caja puede manejar
 * cualquier tipo de objetos 
 */

class Caja <Tipo> { //Clase accesible desde el paquete porque no pone nada
    private Tipo elemento; //atributo llamado elemento

    void add (Tipo e){
        elemento = e;
    }

    Tipo elemento (){
        return elemento;
    }

    public static void main (String[] args) {
        Caja<Integer> cajaInt = new Caja<Integer>(); //Caja que maneja enteros de tipo objeto
        Caja<String> cajaString = new Caja<String>(); //Cajaq que maneja String's 
        cajaInt.add(10); //añade elemento 10 a la caja de enteros
        cajaString.add("Porompompero"); //añade un string a la caja de strings
        System.out.printf("Integer: %d\n", cajaInt.elemento());
        System.out.printf("String: %20s\n", cajaString.elemento());
        /**
         * los % son para controlar la "longitud" que ocupan las cosas al imprimirse
         * %d 
         * %20s pone como que "el String debe de ser 20 caracteres de largo" 
         * pero como no lo es, rellena con espacios a la izquierda
         * \n es un salto de linea. Porque no hemos puesto el println. sino printf
         */
    }    
}
