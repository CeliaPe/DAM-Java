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
      //this.matrizExt = new Ficha();
      //if (matrizExt.getForma().contains("X")) rellenarMatrizX("X");
      //if (matrizExt.getForma().contains("O")) rellenarMatrizXO();
    }
  public void rellenarMatrizEntera(Ficha ficha){
    for (int i = 0; i < this.columnas; i++){
      for (int j = 0; j < this.filas; j++){
        this.matriz[i][j] = ficha;
      }
    }
  }
  public void rellenarMatriz(Ficha ficha){
    for (int i = 0; i < this.columnas; i++){
      for (int j = 0; j < this.filas; j++){
        this.matriz[i][j] = ficha;
      }
    }
  }

  public void rellenarMatrizXO(){
    int contador = 1;
    for (int i = 0; i < this.columnas ; i++){
    for (int j = 0; j < this.filas; j++){
      if (contador % 2 == 1){
          this.matriz[i][j] = "X";
    }  else if (contador % 2 == 0){
           this.matriz[i][j] = "O";
    }
    contador+=1;
      }
  }
  }

  public void posicionTablero(){
    for (int i = 1; i < posiciones.size(); i++){
      System.out.print(i);
      System.out.println(this.fichas.get(i));
    }
  }


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
      System.out.print(this.matriz[i][j]);
      System.out.print("|");
    }
    System.out.println();
    lineaHorizontal();
  }
}

}
