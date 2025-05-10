package UsoClases032;

class PuntoArray implements IPunto {
    private double [] coords = new double[2];
   
    PuntoArray (double [] crds){
        coords = crds;
    }

    public String toString(){
        return "(" + coords[0] + ", " + coords[y] + ")";
    }

    public boolean equals (Object o){
        PuntoArray aux = (PuntoArray)o;
        return coords[0] == aux.coords[0] && coords[1] == aux.coords[1];
    }

    public double distancia (IPunto q){
        PuntoArray aux = (PuntoArray) q;
        return Math.sqrt((coords[0]-aux.coords[0])*(coords[0]-aux.coords[0])+(coords[1]-aux.coords[1])*(coords[1]-aux.coords[1]));
    }

    public void mover (double dx, double dy){
        coords[0] += dx;
        coords[1] += dy;
    }

    public double x(){
        return coords[0];
    }

    public double y(){
        return coords[1];
    }
}
