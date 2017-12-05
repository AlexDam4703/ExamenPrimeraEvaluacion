import java.util.Scanner;
/** Programa para comprobar diversas cosas de un String 
 * @author Alex
 * @version 1.0
*/
public class Cadena{
	public static void main (String [] args) {
		System.out.printf ("Intruzca la cedena que desea comprobar: ");
		Scanner sc = new Scanner (System.in);
		String cadena = sc.nextLine();
		sc.close ();
		comienzaTerminaVocal(cadena);
		System.out.printf ("%n¿La cadena que ha intrudicido contiene m, n o p? %b",ContieneConsonantes(cadena));
		System.out.printf ("%n¿La cadena que ha intrudicido comienza por vocal? %b",ComienzaVocal(cadena));
		 System.out.printf ("%nLa cedena contiene %d vocales",contarVocales(cadena));
		}
/** Programa para comprobar diversas cosas de un String 
 * @author Alex
 * @version 1.0
 * @param Cadena Hay que parle un String
 * @return void no  regresa nada
*/
	public static void comienzaTerminaVocal (String cadena) {
		boolean comienzaTermina = false;
		if (cadena.startsWith("a")||cadena.startsWith("e")||cadena.startsWith("i")||cadena.startsWith("o")||cadena.startsWith("u") ||cadena.startsWith("A")||cadena.startsWith("E")||cadena.startsWith("I")||cadena.startsWith("O")||cadena.startsWith("U"))
		 System.out.printf ("La cadena comienza por vocal%n");
		 if (cadena.endsWith("a")||cadena.endsWith("e")||cadena.endsWith("i")||cadena.endsWith("o")||cadena.endsWith("u")||cadena.startsWith("A")||cadena.startsWith("E")||cadena.startsWith("I")||cadena.startsWith("O")||cadena.startsWith("U"))
		 System.out.printf ("La cadena termina en vocal");
		}
/** Programa para comprobar diversas cosas de un String 
 * @author Alex
 * @version 1.0
 * @param Cadena Hay que parle un String
 * @return boolean retorna un boolean "contiene"
*/
	public static boolean ContieneConsonantes (String cadena){
		boolean contiene = false ;
		if (cadena.contains("m") || cadena.contains("n") || cadena.contains("p") || cadena.contains("M") || cadena.contains("N") || cadena.contains("P"))
		contiene = true; 
		return contiene;
		}
/** Programa para comprobar diversas cosas de un String 
 * @author Alex
 * @version 1.0
 * @param Cadena Hay que parle un String
 * @return boolean , retorna un boolean comienza
*/
	public static boolean ComienzaVocal (String cadena){
		boolean comienza = false;
		if (cadena.startsWith("a")||cadena.startsWith("e")||cadena.startsWith("i")||cadena.startsWith("o") || cadena.startsWith("A")||cadena.startsWith("E")||cadena.startsWith("I")||cadena.startsWith("O"))
		comienza= true;
		return comienza;
/** Programa para comprobar diversas cosas de un String 
 * @author Alex
 * @version 1.0
 * @param Cadena Hay que parle un String
 * @return int Retorna un entero "vocales"
*/
		}
	public static int contarVocales (String cadena){
		int vocales = 0;
		for (int i =0; i <= cadena.length()-1;i++){
			if  (cadena.charAt(i)==('a') || cadena.charAt(i)==('e') || cadena.charAt(i)==('i') || cadena.charAt(i)==('o') || cadena.charAt(i)==('u') || cadena.charAt(i)==('A') || cadena.charAt(i)==('E') || cadena.charAt(i)==('I') || cadena.charAt(i)==('O') || cadena.charAt(i)==('U'))
			vocales++;
			}
		return vocales;
		}
	}
