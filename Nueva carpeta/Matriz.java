public class Matriz{
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.matriz = new int[2][2];
  }
  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }
}
