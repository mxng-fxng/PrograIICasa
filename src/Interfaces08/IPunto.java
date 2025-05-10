package Interfaces08;
//En este fichero solo estan las cabeceras de los metodos
//IMPORTANTE: NO incluir el constructor

interface IPunto {
    public String toString();
    boolean equals (Object o);
    double distancia (IPunto q);
    void mover (double dx, double dy);
    double x();
    double y();
}
