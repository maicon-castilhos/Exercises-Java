import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter how quantity km percursed: ");
		int km = sc.nextInt();
		
		double[] vect = new double[km];//usuario digita quantidade de posição que haverá no array
		
		for (int i = 0 ; i<km ; i++) {// int i = 0 é a posição que o codigo dentro do for começa no array
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0 ; i<km ; i++) {
			sum += vect[i];
		}
		double average = sum / km;
		System.out.printf("Average km percursed is: %.2f%n" , average);
		
		sc.close();
	}

}
