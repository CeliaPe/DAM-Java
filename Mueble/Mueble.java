import java.util.ArrayList;
import java.util.Arrays;

public class Mueble{
  private String material;
  protected ArrayList<Integer> dimensiones;
  //Constructor
  public Mueble(){
    this.material = "Chicle";
    this.dimensiones = new ArrayList<Integer> (Arrays.asList(50,50,50));
  }
  public Mueble(String material, int ancho, int profundo, int alto){
    this.material = material;
    this.dimensiones = new ArrayList<Integer> (Arrays.asList(ancho,profundo,alto));
  }
  public Mueble(String material, ArrayList<Integer> dimensiones){
    this.material = material;
    this.dimensiones = dimensiones;
  }

  public String toString(){

  }

}
