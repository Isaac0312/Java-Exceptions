import ExcepcionCustom.ClaseExcepcion;

public class MainAPP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Generando numero aleatorio...");
		int numero = (int) (Math.random() * (999 - 1))+1;
		System.out.println("El numero generado es: "+numero);
		if(numero >= 1 && numero <= 999) {
			throw new ClaseExcepcion(numero);
		}
		}catch(ClaseExcepcion e) {
			System.out.println(e.getMessage());
		}
	}
}
