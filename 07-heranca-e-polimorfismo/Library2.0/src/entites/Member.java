package entites;

import java.util.ArrayList;
import java.util.List;

import entites.enums.MemberLevel;

public class Member {
	private String name;
	private String email;
	
	private MemberLevel level;
	private List<Loan> loans = new ArrayList<>();
	
	public Member() {
			}
	public Member(String name, String email, MemberLevel level) {
		this.name = name;
		this.email = email;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public MemberLevel getLevel() {
		return level;
	}
	public void setLevel(MemberLevel level) {
		this.level = level;
	}
	public List<Loan> getLoan() {
		return loans;
	}
	public void addLoan (Loan loan) {
		loans.add(loan);
	}
	
	public double totalDebt() {
	    double sum = 0;
	    for (Loan loan : loans) {
	        sum += loan.totalCost();
	    }
	    if (level == MemberLevel.PREMIUM) {
	        sum *= 0.9; // 10% de desconto
	    }
	    return sum;
	}
	@Override
	public String toString() {
	    return "Nome: " + name + 
	           " | Email: " + email + 
	           " | Total: " + totalDebt();
	}
}
