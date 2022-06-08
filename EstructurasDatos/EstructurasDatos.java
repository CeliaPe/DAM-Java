import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

class EstructurasDatos{
  public static void pruebaArrayList(){
    System.out.println("-> Creamos el ArrayList colores.");
    ArrayList<String> colores = new ArrayList<String>();
    System.out.println("-> Aniadimos el color azul y el color amarillo.");
    colores.add("azul");
    colores.add("amarillo");
    System.out.println("-> Imprimimos el ArrayList de colores.");
    System.out.println(colores);
    System.out.println("-> Accedemos al elemento que se encuentra en la primera" +
    "posicion: La posicion 0.");
    System.out.println(colores.get(0));
    System.out.println( "-> Accedemos al elemento que se encuentra en la segunda" +
                        "posicion: La posicion 1.");
    System.out.println(colores.get(1));
    System.out.println( "-> Cambiamos el valor de lo que se encuentra en la " +
                        "segunda posicion de color amarillo a rojo.");
    colores.set(1,"rojo");
    System.out.println(colores);
    System.out.println("-> Eliminamos el elemento que esta en la segunda posicion.");
    colores.remove(1);
    System.out.println(colores);
    System.out.println("-> Para conocer el tamanio del ArrayList se usa size().");
    System.out.println(colores.size());
    System.out.println( "-> Para recorre un ArrayList usamos un bucle. Para " +
                        " compobarlo aniadimos tres colores mas antes de imprimir.");
    colores.add("amarillo");
    colores.add("rojo");
    colores.add("verde");
    for (String c : colores){
      System.out.println(c);
    }
  }
  public static void pruebaLinkedList(){
    System.out.println("-> Creamos el LinkedList colores.");
    LinkedList<String> colores = new LinkedList<String>();
    System.out.println("-> Aniadimos el color azul y el color amarillo.");
    colores.add("azul");
    colores.add("amarillo");
    System.out.println("-> Imprimimos el LinkedList de colores.");
    System.out.println(colores);
    System.out.println("-> Accedemos al elemento que se encuentra en la primera" +
    "posicion: La posicion 0.");
    System.out.println(colores.get(0));
    System.out.println( "-> Accedemos al elemento que se encuentra en la segunda" +
                        "posicion: La posicion 1.");
    System.out.println(colores.get(1));
    System.out.println( "-> Cambiamos el valor de lo que se encuentra en la " +
                        "segunda posicion de color amarillo a rojo.");
    colores.set(1,"rojo");
    System.out.println(colores);
    System.out.println("-> Eliminamos el elemento que esta en la segunda posicion.");
    colores.remove(1);
    System.out.println(colores);
    System.out.println("-> Para conocer el tamanio del LinkedList se usa size().");
    System.out.println(colores.size());
    System.out.println( "-> Para recorre un LinkedList usamos un bucle. Para " +
                        " compobarlo aniadimos tres colores mas antes de imprimir.");
    colores.add("amarillo");
    colores.add("rojo");
    colores.add("verde");
    System.out.println( "-> Aniadimos en la primera posicion negro y en la ultima " +
                        " blanco.");
    colores.addFirst("negro");
    colores.addLast("blanco");
    for (String c : colores){
      System.out.println(c);
    }
    System.out.println("-> Borramos el primer elemento.");
    colores.removeFirst();
    System.out.println(colores);
    System.out.println("-> Mostramos el ultimo elemento.");
    System.out.println(colores.getLast());
  }

  public static void pruebaHasMap(){
    HashMap<String,Integer> edades = new HashMap<String,Integer>();
    System.out.println("-> Aniadimos dos personas.");
    edades.put("Celia",26);
    edades.put("Laura",18);
    edades.put("Iker",22);
    System.out.println(edades);
    System.out.println("-> Consultamos el valor que se guarda en la clave 'Laura'.");
    System.out.println(edades.get("Laura"));
    System.out.println("-> Eliminamos la tupla 'Laura=18'.");
    edades.remove("Laura");
    System.out.println(edades);
    System.out.println("Imprimimos values.");
    System.out.println(edades.values());
    System.out.println("Imprimimos keySet()");
    System.out.println(edades.keySet());

  }

  public static void main(String[] args) {

  // ----------------------------------------------------------------------- //
  // ArrayList
  // ----------------------------------------------------------------------- //
  // pruebaArrayList();

  // ----------------------------------------------------------------------- //
  // LinkedList
  // ----------------------------------------------------------------------- //
  // pruebaLinkedList();

  // ----------------------------------------------------------------------- //
  // HashMap
  // ----------------------------------------------------------------------- //
   pruebaHasMap();

  }
}
