import java.util.Scanner;

public class SumarDigitos {

	public static void main(String[] args) {
		// Inicializaci�n
		System.out.print("Introduce un n�mero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int suma = 0;

		// Proceso
		while (numero>0) {
			suma += numero%10;
			numero/=10;
		}
		
		//Salida
		System.out.printf("La suma de los d�gitos es " + suma);
	}

}
