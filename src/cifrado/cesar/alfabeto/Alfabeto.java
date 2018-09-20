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
	 * Método que permite saber cuántos elementos o letras contiene el alfabeto ingresado.
	 * @return
	 */
	private Integer obtenerNumeroElementos() {
		for (Integer indiceAlfabeto = 0; indiceAlfabeto < alfabeto.length(); indiceAlfabeto++) 
			numeroElementos++;
		return numeroElementos;
	}
	
	/**
	 * Método que permite obtener un caracter del alfabeto en una posición.
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
