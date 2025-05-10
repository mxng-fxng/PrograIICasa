package ListasEnlazadas09;

public class ListaBasica {
    
    public static void main (String [] args){
        Node<Integer> lista;
        lista = null;
        lista = new Node<Integer>(14, lista);
        lista = new Node<Integer>(25, lista);
        lista = new Node<Integer>(36, lista);
        Node<Integer> lista_2 = new Node<Integer>(36,
        new Node<Integer>(25, new Node<Integer>(14, null)));
    }
}
