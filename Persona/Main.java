import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    Persona miPersona = new Persona();
    Alumno alumnoDefecto = new Alumno();
    Alumno miAlumno = new Alumno("Celia","123123123O","DAM");
    //System.out.println(miPersona);
    System.out.println(miAlumno);
    /*
    ArrayList<Integer> lista = new ArrayList();
    lista.add(4);
    lista.add(5);
    System.out.println(lista);

    ArrayList<Alumno> listaAlumno = new ArrayList();
    listaAlumno.add(miAlumno);
    listaAlumno.add(alumnoDefecto);
    System.out.println(listaAlumno);
    System.out.println(listaAlumno.get(0).getNombre());
    */

    Color arrColores[] = Color.values();
    for (Color c : arrColores){
      System.out.println(c);
    }
  }
}
