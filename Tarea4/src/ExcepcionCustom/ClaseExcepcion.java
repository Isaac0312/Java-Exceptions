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
		
		switch(codigo) {
			case 1:	//Error porque no se puede realizar la operacion con un numero negativo
				message = "Error, no se puede realizar la operacion con un numero negativo";
			case 2: //Error al introducir algo que no es un numero
				message = "Error, no has introducido un numero";	
			case 3: 
				message = "Error, no puedes hacer una divison con el numero 0";
		
		}
		
		return message;
	}

}
