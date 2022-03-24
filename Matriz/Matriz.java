public class Matriz{
  private int matriz[][];
  private int filas;
  private int columnas;

  public Matriz(){
    this.filas = 2;
    this.columnas = 2;
    this.matriz = new int[filas][columnas];
    rellenarMatriz(" ");
  }
  public Matriz(int filas, int columnas){
    this.filas = filas;
    this.columnas = columnas;
    this.matriz = new int[filas][columnas];
  }
  public void rellenarMatriz(int numero){
    for (int i = 0 ; i < this.filas ; i++){
      for (int j = 0 ; j < this.columnas ; j++){
        this.matriz[i][j] = numero;
      }
    }
  }
  public void rellenarMatrizFila(){
    // Rellena cada fila con su número de fila
    /*
    -------
    |0|0|0|
    -------
    |1|1|1|
    -------
    |2|2|2|
    -------
    */
    for (int i = 0 ; i < this.filas ; i++){
      for (int j = 0 ; j < this.columnas ; j++){
        this.matriz[i][j] = i;
      }
    }
  }
  public void rellenarMatrizColumna(){
    // Rellena cada columna con su número de columna
    /*
    -------
    |0|1|2|
    -------
    |0|1|2|
    -------
    |0|1|2|
    -------
    */
    for (int i = 0 ; i < this.filas ; i++){
      for (int j = 0 ; j < this.columnas ; j++){
        this.matriz[i][j] = j;
      }
    }
  }
  public void rellenarMatrizPosicion(){
    // Rellena cada posicion con su número
    /*
    -------
    |0|1|2|
    -------
    |3|4|5|
    -------
    |6|7|8|
    -------
    */
    int posicion = 0;
    for (int i = 0 ; i < this.filas ; i++){
      for (int j = 0 ; j < this.columnas ; j++){
        this.matriz[i][j] = posicion;
        posicion++;
      }
    }
  }
  public void rellenarMatrizFilaMasCol(){
    // Rellena cada posicion con su número
    /*
    -------
    |0|1|2|
    -------
    |1|2|3|
    -------
    |2|3|4|
    -------
    */
    for (int i = 0 ; i < this.filas ; i++){
      for (int j = 0 ; j < this.columnas ; j++){
        this.matriz[i][j] = i+j;
      }
    }
  }

  public void lineaH(){
    for (int i = 0 ; i < this.columnas ; i++){
      System.out.print("--");
    }
    System.out.println("-");
  }

  public void imprimir (){
    lineaH();
    for (int i = 0 ; i < this.filas ; i++){
      System.out.print("|");
      for (int j = 0 ; j < this.columnas ; j++){
        System.out.print(this.matriz[i][j]);
        System.out.print("|");
      }
      System.out.println();
      lineaH();
    }
  }
}
