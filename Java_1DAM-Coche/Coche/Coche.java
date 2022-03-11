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
	public String toString(){
		return this.motorCoche + "\n" + this.puertaDer + "\n" + this.puertaIzq;
	}
}
