import java.util.Scanner;

//LUIS DURÁN FLORES - 177406
public class Menuparse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hola, ¿qué tal?");
		System.out.println("Este es un programa que calcula las propiedades de un cuadrado o un círculo.");
		System.out.println("1. Cuadrado");
		System.out.println("2. Círculo");
		System.out.println("¿Con qué figura te gustaría trabajar?");
		System.out.println("Indica el número a continuación: ");
		String str = scan.nextLine();
		int figura = Integer.parseInt(str);
		if(figura == 1) {
			Cuadrado uno = new Cuadrado();
			String in;
			double x;
			System.out.println("Indique la medida del lado de su cuadrado: ");
			in = scan.nextLine();
			x = Double.parseDouble(in);
			uno.cambiaValor(x);
			System.out.println("1. Perímetro");
			System.out.println("2. Área");
			System.out.println("3. Diagonal");
			System.out.println("¿Qué propiedad desea?");
			int propiedad = scan.nextInt();
			if(propiedad == 1) {
				System.out.println("El perímetro vale: "+uno.calculaPerimetro());
			} else {
				if(propiedad == 2) {
					System.out.println("El Área vale: "+uno.calculaArea());
				} else {
					if(propiedad == 3) {
						System.out.println("La diagonal vale: "+uno.calculaDiagonal());
					}
				 } 
			   }
		    }
		    else {
		    	if(figura == 2);
				Circulo one = new Circulo();
				String in;
				double x;
				System.out.println("Indique la medida del radio del círculo: ");
				in = scan.nextLine();
				x = Double.parseDouble(in);
				one.cambiaRadio(x);
				System.out.println("1. Circunferencia");
				System.out.println("2. Área");
				System.out.println("3. Perímetro");
				System.out.println("¿Qué propiedad desea?");
				int eleccion = scan.nextInt();
				if(eleccion == 1) {
					System.out.println("El perímetro vale: "+one.calculaCircunferencia());
				} else {
					if(eleccion == 2) {
						System.out.println("El Área vale: "+one.calculaArea());
					} else {
						if(eleccion == 3);
						System.out.println("El Perímetro vale: "+one.calculaPerimetro());
					}
				}
		    }
	}
}
