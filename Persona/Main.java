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
    // ------------------------------------------------

    Color miColor, miSegundoColor;
    Color arrColores[] = Color.values();
    for (Color c : arrColores){
      System.out.println(c);
    }
    System.out.println();

    System.out.println("Asignando color con Color.COLOR:");
    miColor = Color.ROJO;
    System.out.println(miColor);
    System.out.println("Asignando color con Color.valueOf(\"COLOR\"):");
    miColor = Color.valueOf("VERDE");
    System.out.println(miColor);
    System.out.println(miColor.getNumLapices());
    System.out.println(Color.VERDE.getNumLapices());

    // Ahora con error.
    /*System.out.println("Asignando color que no existe con Color.COLOR:");
    miColor = Color.NEGRO;
    System.out.println(miColor);*/
    /*System.out.println("Asignando color que no existe con Color.valueOf(\"COLOR\"):");
    miColor = Color.valueOf("NEGRO");
    System.out.println(miColor);*/

    System.out.println("Cuantos lapices azules tengo si -2? Me tiene que decir que 0");
    miSegundoColor = Color.valueOf("AZUL");
    miSegundoColor.setNumLapices(-2);
    System.out.println(miSegundoColor.getNumLapices());
    System.out.println("El ordinal mi segundo color AZUL: ");
    System.out.println(miSegundoColor.ordinal());
    System.out.println("El ordinal mi color VERDE: ");
    System.out.println(miColor.ordinal());
    


  }
}
