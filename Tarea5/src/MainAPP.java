import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array de Passwords
		Scanner lectura = new Scanner(System.in);
		int tamaño,longit;
		
		
		
		
		System.out.println("Indica el tamaño de la array: \n");
		tamaño=lectura.nextInt();
		Password aux[] = new Password[tamaño];
		Boolean aux1[] = new Boolean[tamaño];
		
		System.out.println("Indica el tamaño de las contraseñas: \n");
		longit=lectura.nextInt();
		
		for(int cont = 0; cont < tamaño; cont++) {
			aux[cont] = new Password(longit);
			aux1[cont]=aux[cont].esFuerte();
			System.out.println(aux[cont].getContraseña()+" es : "+aux1[cont]);
		}
		lectura.close();
	}

}
