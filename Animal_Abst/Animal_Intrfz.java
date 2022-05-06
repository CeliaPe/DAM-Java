public interface Animal_Intrfz{
  // Al declarar variables en una interfaz hay que inicializarlas.
  // Pero no sirve para nada porque no se heredan xd.
  public String alimentacion = "comida";
  // Podemos definir variables globales:
  public final static int NUMERO = 0;

  public String durmiendo();
  public String comiendo();
  public String onomatopeya();
}
