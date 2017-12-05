public class Numero {
	public static void main (String [] args){
		System.out.printf ("Intruzca un numero: ");
		int numero = Integer.parseInt(args[0]);
		if (numero < 4 || numero > 1000){
			System.out.printf ("El numero: %d no es valido%n",numero);
			}
			else {
				if (numero% 2 ==0)
				System.out.printf ("%nEl numero %d es par",numero);
					else {
						System.out.printf ("El numero %d es impar",numero);
						}
				if (numero % 3 == 0 && numero % 5 ==0)
				System.out.printf ("%nEL numero %d es multiplo de 3 de 5 a la vez",numero);
				System.out.printf ("%nEl numero %d tiene %d digitos%n",numero,args[0].length());
				}
		}
	}
