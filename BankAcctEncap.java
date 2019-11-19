package COMP271;

public class BankAcctEncap {
	
	// data fields 
	private String acctType;
	private String custName;
	private long acctNo;
	
	private float balance; 
	
	// constructor 
	public BankAcctEncap(String type, String name) {
		acctType = type;
		custName = name;
		
		// account number can't be set by user and controlled by the class
		acctNo = System.currentTimeMillis(); 
	}
	
	// retrieve account balance
	public float getBalance() {
		return balance;
	}

	// return account type
	public String getAcctType() {
		return acctType;
	}

	// retrieve account customer name
	public String getCustName() {
		return custName;
	}

	// return account number
	public long getAcctNo() {
		return acctNo;
	}
	
	// make deposit
	public void deposit(float dAmount) {
		balance +=dAmount;
	}
	
	// make withdraw
	public boolean withdraw(float wAmount) {
		if (balance < wAmount) {
			System.out.printf("Withdraw failed: balanance (%0.2f) is lower than withdraw amount (%0.2f)\n", balance, wAmount);
			return false;
		}
		
		balance -= wAmount;
		return true;
	}

}
