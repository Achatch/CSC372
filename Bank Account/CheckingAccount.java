package bank;

public class CheckingAccount extends BankAccount {
	double interestRate;
	public void setInterestRate(double intRate) {
		this.interestRate = intRate;
	}
	public void processWithdrawal(double withdrawlAmount) {
		super.balance = super.balance - withdrawlAmount;
		if (super.balance < 0) {
			System.out.println("An overdraft fee of $30 applies to this withdrawal");
			super.balance = super.balance - 30.0;
		}
	}
}