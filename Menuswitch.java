//LUIS DURÁN FLORES - 177406
import java.util.Scanner;
public class Menuswitch {


		public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Hola, ¿qué tal?");
				while(true) {
					    System.out.println("Este es un programa que calcula las propiedades de un cuadrado o un círculo.");
						System.out.println("1. Cuadrado");
						System.out.println("2. Círculo");
						System.out.println("3. Salir del programa");
						System.out.println("¿Con qué figura te gustaría trabajar?");
						System.out.println("Indica el número a continuación: ");
						String str = scan.nextLine();
						int figura = Integer.parseInt(str);
						switch(figura) {
						case 1:
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
							}
							if (propiedad == 2) {
								System.out.println("El área vale: "+uno.calculaArea());
							}
							if(propiedad == 3) {
								System.out.println("La diagonal vale: "+uno.calculaDiagonal());
							}
							break;
						case 2: 
							Circulo one = new Circulo();
							String on;
							double y;
							System.out.println("Indique la medida del radio del círculo: ");
							on = scan.nextLine();
							y = Double.parseDouble(on);
							one.cambiaRadio(y);
							System.out.println("1. Circunferencia");
							System.out.println("2. Área");
							System.out.println("3. Perímetro");
							System.out.println("¿Qué propiedad desea?");
							int eleccion = scan.nextInt();
							if(eleccion == 1) {
								System.out.println("La circunferencia vale: "+one.calculaCircunferencia());
							}
							if(eleccion ==2) {
								System.out.println("El área vale: "+one.calculaArea());
							}
							if(eleccion == 3) {
								System.out.println("El perímetro vale: "+one.calculaPerimetro());
							}
							break;
						case 3: 
							System.out.println("Elegiste salir del programa...");
							System.exit(0);
							break;
						default:
							System.out.println("Opción inválida...");
							break;
						}
				}
	    }
	}