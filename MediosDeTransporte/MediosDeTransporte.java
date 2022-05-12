public enum MediosDeTransporte{
  //public static final MediosDeTransporte AVION = new MediosDeTransporte(900,10);
  AVION(900,10),
  TREN(200,14),
  COCHE(120,12),
  BICICLETA(20,0);

  private double velocidad;
  private double precio100km;

  MediosDeTransporte(double velocidad, double precio100km){
    this.velocidad = velocidad;
    this.precio100km = precio100km;
  }

  // Get & Set
  
  public double tiempo (double km){
    double tiempoTotal = km/this.velocidad;
    double tiempoEspera = 1;
    if (this == AVION) tiempoTotal += tiempoEspera;
    return tiempoTotal;
  }
  public double precio (double km){
    return (this.precio100km/100)*km;
  }

}
