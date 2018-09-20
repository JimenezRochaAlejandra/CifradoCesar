package cifrado.cesar.textoplano;

/**
 * 
 * @author Ale Rocha
 * 
 * Clase que es el texto de entrada, siendo éste un texto plano.
 *
 */
public class TextoPlano {
	String texto;
	
	public TextoPlano(String textoEntrada) {
		this.texto = new String(textoEntrada);
	}
}
