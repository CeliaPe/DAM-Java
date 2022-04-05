class Main {
  public static void main(String[] args) {
    Ficha fichaX = new Ficha();
    Ficha fichaO = new Ficha("O");
    Tablero tablero = new Tablero(); // Rellena con X
    tablero.imprimir();

    tablero.rellenarTableroEntero(fichaO);
    tablero.imprimir();

    tablero.rellenarTableroXO();
    tablero.imprimir();
  }
}
