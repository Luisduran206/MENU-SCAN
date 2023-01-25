public class Circulo {
	
	public double x;
	
	public Circulo() {
	}
	public double calculaCircunferencia() {
		return x*2;
	}
	public double calculaArea() {
		return Math.PI * Math.pow(x, 2);
	}
	public double calculaPerimetro() {
		return 4 * Math.PI * x;
	}
	public void cambiaRadio(double x) {
		this.x = x;
	}
}