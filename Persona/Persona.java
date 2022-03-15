// Clase persona Herencia
// Dos tipos de herencia: extension (a los métodos del padre le añadimos métodos
// propios) y especializacion (modificamos los métodos del padre para adaptarlos
// a nuestras necesidades).
// Además de la herencia por agregación o composición (añadir clases como atri-
// butos de nuestra clase) explicado en coche.

public class Persona{
  private String nombre;
  private String dni;

  //Constructor
  public Persona(){
    this.nombre = "Celia";
    this.dni = "12345678H";
  }
  public Persona(String nombre, String dni){
    this.nombre = nombre;
    this.dni = dni;
  }

  //Get
  public String getNombre(){
    return this.nombre;
  }
  public String getDni(){
    return this.dni;
  }

  //Set
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setDni(String dni){
    this.dni = dni;
  }

}
