public class Alumno extends Persona{
  private   String grado;               // Acceso desde la propia clase.
            String gradoSinModificador; // Acceso desde el paquete.
  protected String gradoProtegido;      // Acceso desde hijos y desde el paquete.
  public    String gradoPublico;        // Acceso global.


  public Alumno(){
    super();
    this.grado = "DAM";
  }
  public Alumno(String nombre, String dni, String grado){
    // Super llama al constructor de la clase superior (de la que extendemos).
    super(nombre,dni);
    this.grado = grado;
  }

  public String toString(){
    return super.toString() + " Estoy en el grado de " + this.grado + ".";
  }
}
