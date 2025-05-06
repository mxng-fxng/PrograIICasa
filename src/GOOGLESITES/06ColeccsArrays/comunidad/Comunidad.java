/**
 * Comunidad Aut�noma como colecci�n de Localidad(es).
 * Implementada como un array[Localidad].
 */
import java.util.Arrays;

public class Comunidad 
{
  /* Colecci�n de localidades */
  private Localidad[] ldloc;
  
  /* N�mero de localidades guardadas en la colecci�n */
  private int size;
  
  /** Constructor de Comunidad */
  public Comunidad ()
  {
  }
  
  /** "loc est� en esta Comunidad" */
  private boolean esta (Localidad loc)
  {
  }  
  
  /** Comunidad como texto */
  public String toString ()
  {
  }
  
  /** A�ade loc a esta Comunidad poni�ndola al final */
  public void add (Localidad loc)
  {
  }
  
 /**
  * POST: resultado: listado de los nombres de Localidad(es)
  *                  que est�n en esta Comunidad, cada nombre en una l�nea. 
  */
  public String nombresLocalidades ()
  {
  }
  
  /*
   * POST: Devuelve la posici�n que ocupa la Localidad con este nombre.
   *       Si no se encuentra, devuelve -1. 
   */
  public int posicion (String nombre)
  {
  }
  
  /*
   * POST: Devuelve la poblaci�n de la Localidad  con este nombre. 
   *       Si no se encuentra, devuelve -1. 
   */
  public int poblacion (String nombre)
  {
  }
  
  /*
   * POST: resultado: poblaci�n total del grupo de localidades 
   *                  cuyos nombres vienen en ldloc. 
   */
  public int poblacionConjunta (String[] locs)
  {
  }

}