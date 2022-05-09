import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    ContraseniaNum contr;
    String strContr;
    boolean contrValida = false;

    while (!contrValida){
      System.out.print("Introduce una contrasenia: ");
      strContr = sc.nextLine();
      contr = new ContraseniaNum(strContr);
      System.out.print("No repetidos: ");
      System.out.println(contr.noRepetidos());
      System.out.print("Tamanio valido: ");
      System.out.println(contr.tamaValido());
      System.out.print("Caracteres validos: ");
      System.out.println(contr.charValido());
      contrValida = contr.contrValida();
    }
  }
}
