package EXAMEN_21M_PRIMO;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Buenos dias ceinmark, soy Daniel Tejero :)");
		System.out.println("Introduce un numero");
		int numero = entrada.nextInt(); 	

		System.out.println(esPrimo(numero) ? "El numero es primo " : "El numero no es primo");
		
		System.out.print("Divisores del numero " + numero + ": ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }

	}

	public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
	
}
