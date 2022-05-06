class ContraseniaNum extends Contrasenia{

  public ContraseniaNum(String pass){
    super(pass);
  }
  public String tamaValido(){
    String solucion = "Tamanio no valido";
    if ((this.pass).length() >= 4)
      solucion = "Tamanio valido";
    return solucion;
  }
  public String charValido(){
    char[] numeros = {48,49,50,51,52,53,54,55,56,57,58};
    boolean valido = true;
    String solucion =  "Caracter valido";
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = false;
      for (int j = 0 ; j < numeros.length; j++){
        if (numeros[j] == this.pass.charAt(i)) valido = true;
        System.out.println("numero: " + numeros[j] + " la contrasenia: " + this.pass.charAt(i) + " valido: " + valido);
      }
    }
    if (!valido) solucion = "Caracter no valido";
    return solucion;
  }
}
