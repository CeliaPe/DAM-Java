public enum Albergue{
  SIMPLE(1,50,4),
  DOBLE(2,80,4),
  TRIPLE(3,100,4),
  MULTIPLE(6,150,4);

  private int personas;
  private double precio;
  private int habitaciones;

  Albergue(int personas, double precio, int habitaciones){
    this.personas = personas;
    this.precio = precio;
    this.habitaciones = habitaciones;
  }

  private void setPersonas(int personas){
    this.personas = personas;
  }
  private void setPrecio(double precio){
    this.precio = precio;
  }
  public void setHabitaciones(int habitaciones){
    this.habitaciones = habitaciones;
  }
  public int getPersonas(){
    return this.personas;
  }
  public double getPrecio(){
    return this.precio;
  }
  public int getHabitaciones(){
    return this.habitaciones;
  }
}
