package ExcepcionCustom;

public class ClaseExcepcion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	
	public ClaseExcepcion(int codigo) {
		super();
		this.codigo=codigo;
	}
	
	public ClaseExcepcion() {
		super();
	}
	
	public String getMessage() {
		String message="";
		
		if(codigo % 2 == 0) {
			message = "El numero es par";
		} else {
			message = "El numero es impar";
		}
		
		return message;
	}

}
