import java.util.Scanner;

public class Buffer{
  static int tamaBuff = 15;
  
  public static void mostrarBuffer(String[] arr){
    System.out.print("| ");
    for (String s : arr){
      System.out.print(s);
      System.out.print(" | ");
    }
    System.out.println();
  }
  public static void escribir(String[] arr, int pos, String nota){
    pos = pos%tamaBuff;
    arr[pos] = nota;
  }
  public static void leer(String[] arr, int pos){
    pos = pos%tamaBuff;
    System.out.println("Lo que hay en la posicion pos:" + arr[pos]);
  }
  public static boolean puedoLeer(int posL, int posE){
    return posL<posE;
  }
  public static boolean puedoEscribir(int posL, int posE){
    return posE < posL+tamaBuff;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] buff = new String [tamaBuff];
    int opcion;
    int posLectura = 0, posEscritura = 0;

    mostrarBuffer(buff);
    // Con while (true) nunca nos salimos del bucle.
    while (true){
      System.out.println("Quiere: \n 1. Leer. \n 2. Escribir. \n 3. Mostrar buffer.");
      opcion = Integer.parseInt(sc.nextLine());

      if (opcion == 1){
        if (puedoLeer(posLectura,posEscritura)){
          System.out.println("Leemos");
          leer(buff,posLectura);
          posLectura++;
        } else System.out.println("No puedes leer algo que no se ha escrito...");
      } else if (opcion == 2){
        if (puedoEscribir(posLectura,posEscritura)){
          System.out.print("Que quieres escribir? ");
          String nota = sc.nextLine();
          System.out.println("Escribimos");
          escribir(buff,posEscritura,nota);
          posEscritura++;
        } else System.out.println("No puedes escribir sobre algo que no se ha leido...");
      } else if (opcion == 3){
        mostrarBuffer(buff);
      } else {
        System.out.println("Debe introducir un valor valido...");
      }
    }

  }
}
