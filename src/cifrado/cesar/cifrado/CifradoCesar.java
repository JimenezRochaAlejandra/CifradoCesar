package cifrado.cesar.cifrado;

import cifrado.cesar.alfabeto.Alfabeto;
import cifrado.cesar.textoplano.*;

/**
 * 
 * @author Ale Rocha
 *
 * Se respetan:
 *  - Mayúsculas/Minúsculas
 *  - Caracteres que no forman parte del alfabeto
 *  
 * Los números son tratados independientemento del alfabeto
 *  (0,1,2,3,4,5,6,7,8,9)
 *  
 * Ejemplo:
 * 	"ABCDEF"
 * 	Entrada: "B8e" 
 * 	Desplazamiento: 3 
 * 	Resultado: "E1b"
 * 
 * Clase que permitirá la implementación o control del cifrado César.
 */
public class CifradoCesar {
	private TextoPlano textoEntrada;
	private TextoCifrado textoSalida;
	private Integer desplazamiento;
	private Alfabeto alfabeto;
	
	/**
	 * Constructor de la clase.
	 * 
	 * @param textoEntrada
	 * @param desplazamiento
	 * @param alfabeto
	 */
	public CifradoCesar(TextoPlano textoEntrada,Integer desplazamiento,Alfabeto alfabeto) {
		this.textoEntrada = textoEntrada;
		this.desplazamiento = desplazamiento;
		this.alfabeto = alfabeto;
		cifrado(textoEntrada, desplazamiento);
	}
	
	/**
	 * Método para cifrar que devuelve el texto cifrado en un objeto de tipo TextoCifrado.
	 *  
	 * @param textoDeEntrada
	 * @param desplazamiento
	 * @return
	 */
	private TextoCifrado cifrado(TextoPlano textoDeEntrada,Integer desplazamiento) {
		// x + n mod 26
		// x + n mod alfabeto.numeroElementos
		
		//letra en la que se esté --> alfabeto.obtenerCaracter(desplazamiento);
		return textoSalida;
	}
	
	/**
	 * Método main para pruebas.
	 * @param args
	 */
	public static void main(String[] args) {
		TextoPlano textoplano = new TextoPlano("hola");
		Integer desplazamiento = new Integer(5);
		Alfabeto alfabetoFrances = new Alfabeto("abcdefghijklmnopqrstuvwxyzàèùéâêîôûçëïüÿœæ");
		Alfabeto alfabetoRuso = new Alfabeto("абвгдеёжзий");
		Alfabeto alfabetNumeros = new Alfabeto("0123456789");
		CifradoCesar cc = new CifradoCesar(textoplano, desplazamiento, alfabetoFrances);
		cc.cifrado(textoplano, desplazamiento);
	}
}
