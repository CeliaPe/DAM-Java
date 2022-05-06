public abstract class Contrasenia{
  protected String pass;

  public Contrasenia(String pass){
    this.pass = pass;
  }

  public String noRepetidos(){
    return "No se reptien";
  }
  public abstract String tamaValido();
  public abstract String charValido();

  public String toString(){
    return "La contrasenia es " + this.pass + ".";
  }
}
