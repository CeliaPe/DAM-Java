class Main{
  public static void main(String[] args) {
    ContraseniaNum pass = new ContraseniaNum("1234a");
    System.out.println(pass.noRepetidos());
    System.out.println(pass.tamaValido());
    System.out.println(pass.charValido());
  }
}
