package UsoPredef04;
import java.awt.Color; //importa la clase color
import stdlib.StdDraw;

public class ColorPrueba {
    public static void main (String [] args){

        //TIPO COLOR
        Color c = new Color(9,90,166); //crea un nuevo obneto de tipo color
        StdDraw.setPenColor(c);
        StdDraw.clear(c);

        StdDraw.filledSquare(.5,.5,.2);
        StdDraw.clear();
        StdDraw.filledSquare(.5,.5,.2);

        StdDraw.setPenColor(c.brighter());// lo pinta un tono más clarito, se puede aplicar continuamente
        StdDraw.filledSquare(.5,.5,.2);
    }
}
