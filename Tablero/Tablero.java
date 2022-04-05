import java.util.ArrayList;

class Tablero{
  private Ficha tablero[][];
  private int filas;
  private int columnas;
  //public Ficha matrizExt;
  //private ArrayList<Integer> posiciones = new ArrayList<>();
  //private ArrayList<String> fichas = new ArrayList<>();

  public Tablero(){
      this.filas = 3;
      this.columnas = 3;
      this.tablero = new Ficha[filas][columnas];

      Ficha ficha = new Ficha();
      this.rellenarTableroEntero(ficha);
    }
  public void rellenarTableroEntero(Ficha ficha){
    for (int i = 0; i < this.columnas; i++){
      for (int j = 0; j < this.filas; j++){
        this.tablero[i][j] = ficha;
      }
    }
  }
  public void rellenarTableroXO(){
    Ficha fichaX = new Ficha();
    Ficha fichaO = new Ficha("O");
    for (int i = 0; i < this.columnas ; i++){
      for (int j = 0; j < this.filas; j++){
        if ((i+j) % 2 == 0){
          this.tablero[i][j] = fichaX;
        } else this.tablero[i][j] = fichaO;
      }
    }
  }
  /*
  public void posicionTablero(){
    for (int i = 1; i < posiciones.size(); i++){
      System.out.print(i);
      System.out.println(this.fichas.get(i));
    }
  }

*/
  public void lineaHorizontal(){
for (int i = 0; i < this.columnas ; i++){
  System.out.print("--");
}
System.out.println("-");
  }
public void imprimir(){
  lineaHorizontal();
  for (int i = 0; i < this.filas ; i++){
    System.out.print("|");
    for (int j = 0; j < this.columnas; j++){
      System.out.print(this.tablero[i][j].getForma());
      System.out.print("|");
    }
    System.out.println();
    lineaHorizontal();
  }
}

}
