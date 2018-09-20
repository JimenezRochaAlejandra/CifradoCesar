package cifrado.cesar.alfabeto;

/**
 * 
 * @author Ale Rocha
 * 
 * Clase que permite crear un alfabeto.
 *
 */
public class Alfabeto {
	String alfabeto;
	Integer numeroElementos;
	String elemento;
	
	/**
	 * Constructor de la clase 
	 */
	public Alfabeto(String alfabeto) {
		this.alfabeto = new String(alfabeto);
		numeroElementos = 0;
		numeroElementos = obtenerNumeroElementos();
		elemento = "";
	}
	
	/**
	 * M�todo que permite saber cu�ntos elementos o letras contiene el alfabeto ingresado.
	 * @return
	 */
	private Integer obtenerNumeroElementos() {
		for (Integer indiceAlfabeto = 0; indiceAlfabeto < alfabeto.length(); indiceAlfabeto++) 
			numeroElementos++;
		return numeroElementos;
	}
	
	/**
	 * M�todo que permite obtener un caracter del alfabeto en una posici�n.
	 * @param posicion
	 * @return
	 */
	private String devolverCaracter(Integer posicion) {
		elemento = alfabeto.charAt(posicion) + "";
		return elemento;
	}
//	public static void main(String[] args) {
//		Alfabeto a = new Alfabeto("abcdefghijklmnopqrstuvwxyz");
//		System.out.println(a.numeroElementos);
//	}
}
