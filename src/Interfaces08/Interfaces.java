package Interfaces08;

public class Interfaces {
    /**
     * Texto
     * @param <E> es de tipo GENERICO. Puede manejar cualquier tipo de 
     * dato (tanto primitivo como de cualquier tipo de objeto que creemos)
     * @param a es un array el parámetro de entrada
     * @return devuelve un String con los valores del array a dados
     */
    public static <E> String texto (E[]a){
        String s = "";
        for (E e : a) s += " " + e;
        /**
         * Bucle FOR-EACH
         * este bucle a diferencia del normal, recorre cada elemento del array, sin usar indices
         * for (Tipo elemento : array)
         */
        return s;
    }

     public static void main (String [] args){
            // int[] intArray = {1, 2, 3, 4, 5}; // Error de compilación
            //Los arrays siguientes son del tipo wrap correspondiente... son arrays de objetos
            Integer[] ai = {1, 2, 3, 4, 5}; //int objeto
            Double[] ad = {1.1, 2.2, 3.3, 4.4}; //double objeto
            Character[] ac = {'a', 'b', 'c', 'd'};//char objeto
            Boolean[] ab = {true, false}; //boolean objeto
            String[] as = {"en", "un", "lugar"}; //string ya es clase""""

            //Esto nos enseña como el metodo texto puede ser usado con cualquier tipo de array
            System.out.println("ai = " + texto(ai));
            System.out.println("ad = " + texto(ad));
            System.out.println("ac = " + texto(ac));
            System.out.println("ab = " + texto(ab));
            System.out.println("as = " + texto(as));
        }
}
