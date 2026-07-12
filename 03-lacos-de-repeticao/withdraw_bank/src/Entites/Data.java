package Entites;

public class Data {
	private int account;
	private String name;
	private double deposit;

	public Data(int account, String name, double deposit) {
		this.account = account;
		this.name = name;
		this.deposit = deposit;
	}

	private static final double WITHDRAW_FF = 6.50;

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	public void depositAccount(double deposit) {
		this.deposit += deposit;
	}

	public void withdrawAccount(double deposit) {
		if (deposit > this.deposit) {
			System.out.print("Your balance not avaliable ");
		} else {
			this.deposit -= deposit + WITHDRAW_FF;
			System.out.printf("You have a balance R$ %.2f" , getDeposit());
		}
	}

	public String toString() {
		return getName() 
				+ " Your number account is " 
				+ String.format("%d", getAccount()) 
				+ " You have deposited R$ "
				+ String.format("%.2f", getDeposit());

	}
}
