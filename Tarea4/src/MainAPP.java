
import java.util.Scanner;

import javax.swing.JOptionPane;

import ExcepcionCustom.ClaseExcepcion;

public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = new Scanner(System.in);
		double numero_1 = 0,numero_2 = 0;
		int numero_op = 0;
		String aux1;
		
		do {
			
			JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora, a continuacion le mostraremo las operaciones que puede realizar: \n");
			
			JOptionPane.showMessageDialog(null,"1    Suma\n 2    Resta\n 3    Multiplicacion\n 4    Division\n 5    Potencia\n 6    Raiz cuadrada\n 7    Raiz cubica\n");
			
			//Aqui va excepcion por si no introduce un numero
			try {
				
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero para realizar una operacion\n");
				numero_op=Integer.parseInt(aux1);
			
			}catch(NumberFormatException e) {
				ClaseExcepcion aux = new ClaseExcepcion(2);
				JOptionPane.showMessageDialog(null,aux.getMessage(),null,JOptionPane.ERROR_MESSAGE);
				
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero para realizar una operacion\n");
				numero_op=Integer.parseInt(aux1);
			}
			
			JOptionPane.showMessageDialog(null,"Ahora, introduce el primer numero para realizar las operaciones: \n");
			///Otra excepcion 
			try {
				
		
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero\n");
				numero_1=Integer.parseInt(aux1);
			
			}catch(NumberFormatException e) {
				ClaseExcepcion aux = new ClaseExcepcion(2);
				JOptionPane.showMessageDialog(null,aux.getMessage(),null,JOptionPane.ERROR_MESSAGE);
				
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero valido\n");
				numero_1=Integer.parseInt(aux1);
			}
			
			
			
			JOptionPane.showMessageDialog(null,"Introduce el segundo numero, si la operacion no requiere un segundo numero, introduce un 0 \n");
			//Aqui va otra excepcion
			
			try {
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero\n");
				numero_2=Integer.parseInt(aux1);
			
			}catch(NumberFormatException e) {
				ClaseExcepcion aux = new ClaseExcepcion(2);
				JOptionPane.showMessageDialog(null,aux.getMessage(),null,JOptionPane.ERROR_MESSAGE);
				
				aux1=JOptionPane.showInputDialog(null,"\nIndique un numero valido\n");
				numero_2=Integer.parseInt(aux1);
			}
			
			
			Calculadora aux = new Calculadora(numero_1,numero_2,numero_op);
			JOptionPane.showMessageDialog(null,"\nEl resultado de la operacion es: "+aux.operacion());
			lectura.close();
			return;
		}while(true);
	}

}
