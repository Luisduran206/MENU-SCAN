public class Cuadrado {
	
	public double x;

	public Cuadrado(){
	}
	public double calculaPerimetro() {
		return x+x+x+x;
	}
	public double calculaArea() {
		return x*x;
	}
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(x, 2)*2);
	}
	public void cambiaValor(double x) {
		this.x = x;
	}
}