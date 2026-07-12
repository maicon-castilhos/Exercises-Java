import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int saldo = 1000;

		Scanner sc = new Scanner(System.in);

		System.out.printf("Escolha uma opção: %n 1. Saldo %n 2. Depositar %n 3. Sacar %n 4. sair");
		int usuario = sc.nextInt();

		while (usuario != 4) {
			switch (usuario) {
			case 1:
				System.out.println("Você tem: R$ " + saldo + " em sua conta ");
				break;
			case 2:
				System.out.println("Digite o valor depositado:");
				int dep = sc.nextInt();
				saldo += dep;
				System.out.printf("Recebemos seu depósito de R$ %d. Agora seu saldo é de R$ %d%n", dep, saldo);
				break;
			case 3:
				System.out.println("Digite o valor do saque");
				int sac = sc.nextInt();

				if (sac > saldo) {
					System.out.println("Saldo insuficiente");
				} else {
					System.out.println("Foi sacado o valor de R$ " + sac);
					saldo -= sac;
				}
				break;
			default:
				System.out.println("Opção inválida");
			}
			System.out.printf("Escolha novamente uma opção: %n 1. Saldo %n 2. Depositar %n 3. Sacar %n 4. sair");
			usuario = sc.nextInt();
		}


		System.out.println("Agradecemos sua confiança!");
		sc.close();

	}

}
