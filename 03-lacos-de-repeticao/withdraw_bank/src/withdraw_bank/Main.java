package withdraw_bank;

import java.util.Locale;
import java.util.Scanner;

import Entites.Data;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter number account: ");
		int account = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter name principal account: ");
		String name = sc.nextLine();

		System.out.print("Value deposited for open account: ");
		double deposit = sc.nextDouble();
		Data data = new Data(account, name, deposit);
		System.out.print("Your data is: ");
		System.out.println(data);

		System.out.print("Enter deposit account: ");
		data.depositAccount(sc.nextDouble());
		System.out.print("Updated account: " + data);
		System.out.println();

		System.out.print("Enter withdraw account: ");
		data.withdrawAccount(sc.nextDouble());
		sc.close();
	
	}

}
