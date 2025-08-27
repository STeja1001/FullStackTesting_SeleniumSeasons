package assignments;

public class BankApp {
	
	public void withdraw(double balanceInAccount, double amountToWithdraw) {
		
		if(amountToWithdraw>balanceInAccount) {
			throw new InsufficientBalanceException("Insufficient Balance, withdraw amount is "+amountToWithdraw+" , which exceeds available balance "+balanceInAccount);
		}
	
		balanceInAccount -= amountToWithdraw;
	
	System.out.println("Withdrawal successful! Remaining balance: "+balanceInAccount);
	
	}

}
