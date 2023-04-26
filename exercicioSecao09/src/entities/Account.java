package entities;

public class Account {
	
	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		addDeposit(initialDeposit);
		
	}
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	
	public String getHolder() {
		return holder;
		
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
		public void addDeposit(double deposit) {
		balance += deposit;
	}
	
	public void removeDeposit(double deposit) {
		balance -= deposit + 5.0;
	}
	
//	public double totalValue() {
//		return 
//	}
	
	public String toString() {
		return  "Account "
				+ accountNumber 
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance );
	 
	}
}
