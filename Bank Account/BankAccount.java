package bank;
public class BankAccount {
	String firstName;
	String lastName;
	int accountID;
	double balance;
	public BankAccount() {
		balance = 0.0;
	}
	public void deposit(double depositAmount) {
		this.balance = this.balance + depositAmount;
	}
	public void withdrawl(double withdrawlAmount) {
		if (withdrawlAmount > this.balance){
			System.out.println("Insufficient funds");
		}
		else {
			this.balance = this.balance - withdrawlAmount;
		}
	}
	public void setFirst(String newFirst) {
		firstName = newFirst;
	}
	public String getFirst() {
		return firstName;
	}

	public void setLast(String newLast) {
		lastName = newLast;
	}
	public String getLast() {
		return lastName;
	}
	public void setAccountID(int AccID) {
		this.accountID = AccID;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void accountSummary() {
		System.out.println("**Account Summary**\n"
				+ "Name: "+firstName+" "+lastName+"\n"
				+"Account ID: "+accountID+"\n"
				+ "Balance: "+balance+"\n");
	}
}

