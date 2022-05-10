public class Alumno extends Persona{
  private enum Nota{
    SOBRESALIENTE,
    NOTABLE,
    BIEN,
    SUFICIENTE,
    INSUFICIENTE
  }
  // Como traduce Java un ENUM:
  /*
  class Nota{
    public static final Nota SOBRESALIENTES = new Nota();
    public static final Nota NOTABLE = new Nota();
    public static final Nota BIEN = new Nota();
    .
    .
  }
  */

  private   String grado;               // Acceso desde la propia clase.
            String gradoSinModificador; // Acceso desde el paquete.
  protected String gradoProtegido;      // Acceso desde hijos y desde el paquete.
  public    String gradoPublico;        // Acceso global.

  private   Nota   nota;
  private   String resultadoNotas;      // No tiene set/get proque se utiliza solo en el switch.

  public Alumno(){
    super();
    this.grado = "DAM";
    this.nota = Nota.SUFICIENTE;
  }
  public Alumno(String nombre, String dni, String grado){
    // Super llama al constructor de la clase superior (de la que extendemos).
    super(nombre,dni);
    this.grado = grado;
    this.nota = Nota.SUFICIENTE;
  }
  public Alumno(Alumno alumno){
    super (alumno.nombre,alumno.dni);
    this.grado = alumno.grado;
    this.nota = alumno.nota;
  }

  private String stringNotas(){
    switch(this.nota){
      case SOBRESALIENTE:
        resultadoNotas = "Oleeeeee! Así se hase! :)";
        break;
      case NOTABLE:
        resultadoNotas = "Lo has hecho muy bien!";
        break;
      case BIEN:
        resultadoNotas = "Bien!";
        break;
      case SUFICIENTE:
        resultadoNotas = "Ta' bien... Pero por lo' peloh";
        break;
      case INSUFICIENTE:
        resultadoNotas = "Así NO se hase! :(";
        break;
    }
    return resultadoNotas;
  }

  public String toString(){
    return super.toString() + " Estoy en el grado de " + this.grado +
    " y el profesor me ha dicho que " + this.stringNotas();
  }
}
