
/*
------------------------
|   Electrodomestico   |
|----------------------|
| - precioBase         |
| - color              |
| - consumoEnergetico  |
| - peso               |
|----------------------|
| + precioFinal()      |
|----------------------|
*/

public class Electrodomestico{
  private double precioBase;
  private String color;                 //Blanco, Negro, Rojo, Azul, Metalizado. 
  private String consumoEnergetico;
  private double peso;

  //Constructores
  public Electrodomestico(){
    this.precioBase = 100;
    this.color = "Blanco";
    this.consumoEnergetico = "F";
    this.peso = 20;
  }
  public Electrodomestico(double precioBase, String consumoEnergetico){
    this.precioBase = precioBase;
    this.color = "Blanco";
    this.consumoEnergetico = consumoEnergetico;
    this.peso = 20;
  }
  public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso){
    this.precioBase = precioBase;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
  }
  public Electrodomestico(Electrodomestico electrodomestico){
    this.precioBase = electrodomestico.precioBase;
    this.color = electrodomestico.color;
    this.consumoEnergetico = electrodomestico.consumoEnergetico;
    this.peso = electrodomestico.peso;
  }


}
