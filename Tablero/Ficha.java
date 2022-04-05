
public class Ficha{
  private String forma;
  private String color;

  public Ficha(){
    this.forma = "X";
    this.color = "azul";
  }
  public Ficha(String forma){
    if(forma == "X" || forma == "O") this.forma = forma;
    this.color = "azul";
  }
  public Ficha(String forma, String color){
    if(forma == "X" || forma == "O") this.forma = forma;
    this.color = color;
  }
  public Ficha(Ficha ficha){
    this.forma = ficha.forma;
    this.color = ficha.color;
  }

  public String getForma(){
    return this.forma;
  }
  public void setForma(){
    this.forma = forma;
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(){
    this.color = color;
  }
}
