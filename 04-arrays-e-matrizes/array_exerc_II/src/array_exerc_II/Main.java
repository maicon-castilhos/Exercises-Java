package array_exerc_II;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Dseja digitar quantos números? ");
		int n = sc.nextInt();
		double soma = 0;
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}

		System.out.print("Valores: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);

		}
		System.out.printf("%nSoma: ");
		System.out.printf("%.2f%n", soma);

		double average = soma / n;
		System.out.printf("Média: %.2f", average);

	}

}
