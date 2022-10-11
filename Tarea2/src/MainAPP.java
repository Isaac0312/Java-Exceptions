import ExcepcionCustom.ClaseExcepcion;
public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		
		try {
			System.out.println("Mensaje mostrado por pantalla");
			if(num == 7) {
				throw new ClaseExcepcion(7);
			}
		}catch(ClaseExcepcion e) {
			System.out.println(e.getMessage());
			System.out.println("Programa terminado");
		}
	}

}
