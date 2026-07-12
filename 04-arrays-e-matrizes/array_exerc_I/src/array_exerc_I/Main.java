package array_exerc_I;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Digite a quantidade de números a digitar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		int i;
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		boolean encontrou = false;
		for (i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println("Números negativos: ");
				System.out.println(vect[i]);
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Não há números negativos");
		}
	}
}
