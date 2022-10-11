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
		System.out.println("Estamos en el constructor de la clase excepcion que hemos creado");
	}
	
	public ClaseExcepcion() {
		super();
	}
	
	public String getMessage() {
		String message="";
		
		switch(codigo) {
		case 7:
			message="Hola, probando la clase excepcion";
		}
		
		return message;
	}

}
