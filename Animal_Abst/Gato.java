// Clase Gato extiende la clase Animal.

/*class Gato extends Animal{
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return super.durmiendo() + " -> RRRrrrrRRRRrrRRRrrR";
  }
  public String comiendo(){
    this.alimentacion = "Peces";
    return "Yo como " + this.alimentacion;
  }
}*/

// Clase Gato implementa la interfaz Animal_Intrfz.
class Gato implements Animal_Intrfz{
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "ZzzZz -> RRRrrrrRRRRrrRRRrrR";
  }
  public String comiendo(){
    String alimentacion = "peces";
    return "Yo como " + alimentacion;
  }
}
