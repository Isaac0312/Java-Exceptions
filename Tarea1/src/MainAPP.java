import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero_aleatorio,numero_introducido = 0,cont=0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Generando numero...\n");
		numero_aleatorio=(int) (Math.random() * (500 - 1))+1;
		System.out.println("Ya hemos generado un numero, porfavor, introduce uno para adivinar-lo!");
		
		
		do {
			
			try {
				numero_introducido=lectura.nextInt();
				
				if(numero_introducido > numero_aleatorio) {
					System.out.println("El numero a adivinar es menor");
					cont=cont+1;
				}
				
				if(numero_introducido < numero_aleatorio) {
					System.out.println("El numero a adivinar es mayor");
					cont=cont+1;
				}
				
				if(numero_introducido == numero_aleatorio) {
					System.out.println("Enhorabuena, has adivinado el numero, numero de intentos realizados: "+cont);
					lectura.close();
					return;
				}
			
			}catch(InputMismatchException e) {
				System.out.println("No has introducido un numero valido, a continuacion puedes introducir uno");
				cont++;
				lectura.nextLine();
				
			}
			
		}while(true);
	}

}
