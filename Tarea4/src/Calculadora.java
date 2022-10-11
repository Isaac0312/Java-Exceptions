import javax.swing.JOptionPane;

import ExcepcionCustom.ClaseExcepcion;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	private int numero_operacion;
	
	public Calculadora(){
		
	}
	
	public Calculadora(double numero1, double numero2, int numero_operacion) {
		this.numero1=numero1;
		this.numero2=numero2;
		this.numero_operacion=numero_operacion;
	}
	
	
	public double operacion() {
		switch(numero_operacion) {
		
			case 1: //En este caso es una suma
				return numero1 + numero2;
				
			case 2: //En este caso una resta
				return numero1 - numero2;
				
			case 3: //En este caso una multiplicacion
				return numero1*numero2;
				
			case 4: //En este caso una division
				try {
					
					if(numero2 < 0) { throw new ClaseExcepcion(1); }
					if(numero2 == 0) { throw new ClaseExcepcion(3); }
					
					return numero1/numero2;  //Aqui va una excepcion en la division cuando es dividido entre 0
					
				}catch(ClaseExcepcion | ArithmeticException e) {
					JOptionPane.showMessageDialog(null,e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
					return 0;
				}
				
				
			case 5: //En este caso es una potencia
				
					try {
						if(numero1 < 0) { throw new ClaseExcepcion(1); }
						return (int) Math.pow(numero1, numero2);
					}catch(ClaseExcepcion e) {
						JOptionPane.showMessageDialog(null,e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
						return 0;
					}
					
			case 6: //En este caso es una raiz cuadrada
				
				try {
					
					if(numero1 < 0) { throw new ClaseExcepcion(1); }
					
					return (int) Math.sqrt(numero1);	//Aqui va una excepcion por si el numero es negativo
				
				}catch(ClaseExcepcion e) {
					JOptionPane.showMessageDialog(null,e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
					return 0;
				}
					
			case 7: //En este caso es una raiz cubica
					try {
						if(numero1 < 0) { throw new ClaseExcepcion(1); }
						return (int) Math.cbrt(numero1);
						
					}catch(ClaseExcepcion e) {
						JOptionPane.showMessageDialog(null,e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
						return 0;
					}
			}
		return 0;
	}
	
	
	public void Operacion() {
		
	}
}
