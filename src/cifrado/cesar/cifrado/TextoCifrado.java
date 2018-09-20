package cifrado.cesar.cifrado;

/**
 * 
 * @author Ale Rocha
 * 
 * Clase que permite tener un objeto de tipo TextoCifrado.
 * Esto es cuando ya se proceso un texto plano en el cifrado César.
 *
 */
public class TextoCifrado {
	String textoCifrado;
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param textoCifrado
	 */
	public TextoCifrado(String textoCifrado) {
		this.textoCifrado = new String(textoCifrado);
	}
}
