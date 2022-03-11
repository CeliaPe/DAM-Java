class Main {
 public static void main (String[] args){
 	Coche miCoche = new Coche();
  Ventana ventanaDerCoxe = new Ventana();
  System.out.println(miCoche);
  //Ver como está el motor:
  System.out.println(miCoche.getMotor());
  //Ver como está la puerta derecha:
  System.out.println(miCoche.getPuertaDer());
  //Abrir puerta derecha:
  miCoche.getPuertaDer().abrir();
  System.out.println(miCoche.getPuertaDer());
  //Ver como está la ventana de la puerta derecha:
  System.out.println(miCoche.getPuertaDer().getVentana());
  miCoche.getPuertaDer().getVentana().abrir();
  System.out.println(miCoche.getPuertaDer().getVentana());
  //Queremos trabajar con la ventana derecha: Es más cómodo si la guardamos en una variable.
  ventanaDerCoxe = miCoche.getPuertaDer().getVentana();
  ventanaDerCoxe.abrir();
  System.out.println(ventanaDerCoxe);
  ventanaDerCoxe.cerrar();
  System.out.println(ventanaDerCoxe);
  miCoche.abrirVentanaDer();
  System.out.println(miCoche);
 }
}
