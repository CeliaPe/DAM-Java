class Coche{
	private Motor motorCoche;
	private Puerta puertaIzq;
	private Puerta puertaDer;

	public Coche(){
		this.motorCoche = new Motor();
		this.puertaIzq = new Puerta();
		this.puertaDer = new Puerta();
	}
	public Puerta getPuertaIzq(){
		return this.puertaIzq;
	}
	public Puerta getPuertaDer(){
		return this.puertaDer;
	}
	public Motor getMotor(){
		return this.motorCoche;
	}
	public void abrirVentanaDer(){
		this.puertaDer.getVentana().abrir();
	}
	//Para abrir cualquier puerta/ventana:
	public void abrirCualquierPuerta(int puerta){
		if (puerta==1){
			this.puertaIzq.abrir()
		}
		if (puerta==2){
			this.puertaDer.abrir()
		}
	}
	//Asumo que abrirVentanaDer() no existe
	public void abrirCualquierVentana(int ventana){
		if (ventana==1){
			this.puertaIzq.getVentana().abrir();
		}
		else if (ventana==2){
			this.puertaDer.getVentana().abrir();
		}
	}
	public String toString(){
		return this.motorCoche + "\n" + this.puertaDer + "\n" + this.puertaIzq;
	}
}
