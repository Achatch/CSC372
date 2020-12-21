package bank;

public class testAccount {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		
		obj.setAccountID(545);
		obj.setFirst("John");
		obj.setLast("Smith");
		
		obj.deposit(200);
		
		obj.accountSummary();
		
		obj.processWithdrawal(300);
		obj.accountSummary();
		
		
		
	}

}
