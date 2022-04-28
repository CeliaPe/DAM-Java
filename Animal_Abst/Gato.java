class Gato extends Animal{
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
}
