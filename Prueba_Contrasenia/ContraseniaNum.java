class ContraseniaNum extends Contrasenia{

  public ContraseniaNum(String pass){
    super(pass);
  }
  public boolean tamaValido(){
    /*// Solución para establecer estructura.
    return "tamaValido sin implementar";
    */
    /* // Solución para para devolver String y que sea más visual
    String solucion = "Tamanio no valido";
    if ((this.pass).length() >= 4)
      solucion = "Tamanio valido";
    return solucion;
    */
    // Solucion final con boolean
    return (this.pass).length() >= 4;
  }
  public boolean charValido(){
    /*// Solución para establecer estructura.
    return "charValido sin implementar";
    */
    // Solucion mejorable -> Añadir otro bool para optimizar + isDigit()
    /*
    char[] numeros = {48,49,50,51,52,53,54,55,56,57,58};
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = false;
      for (int j = 0 ; j < numeros.length; j++){
        if (numeros[j] == this.pass.charAt(i)) valido = true;
        //System.out.println("numero: " + numeros[j] + " la contrasenia: " + this.pass.charAt(i) + " valido: " + valido);
      }
    }
    return valido;
    */
    // Para cada letra de la contraseña pass
    // (this.pass.charAt(i))
    // comprobamos si es un dígito/numero
    // (Character.isDigit(char que queremos comprobar))
    boolean valido = true;
    for (int i = 0 ; i < (this.pass).length() && valido; i++){
      valido = Character.isDigit(this.pass.charAt(i));
    }
    return valido;
  }
}
