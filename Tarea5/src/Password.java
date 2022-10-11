import java.security.SecureRandom;

public class Password {
	
	private static final int LONGITUD = 8;
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=LONGITUD;
		this.contraseña=generateRandomPassword(this.longitud);
	}
	
	public Password(int length) {
		this.longitud=length;
		this.contraseña=generateRandomPassword(length);
	}
	
	
	public boolean esFuerte() {
		int cont;
		int upperCase = 0,lowerCase=0,number=0;
		for(cont=0; cont < this.contraseña.length();cont++) {
			char aux = contraseña.charAt(cont);
			
			if(aux >= 'A' && aux <= 'Z') {
				upperCase++;
			}
			
			if(aux >= 'a' && aux <= 'z') {
				lowerCase++;
			}
			
			if(Character.isDigit(aux)) {
				number++;
			}
			
		}
		
		if(upperCase >= 2 && lowerCase >= 1 && number >= 5) {
			return true;
		}
		return false;
	}
	
	private static String generateRandomPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	
}
