package com.tka.cricket;

public class Account {

	private int AccountNo;
	private String CustomerName;
	private String BankName;
	private String Email;
	private float MobileNo;
	private float balance;
	
	Account (){

	}
	
	Account (int Ac, String Cn, String Bn, String E, float B){
		AccountNo = Ac;
		CustomerName = Cn;
		BankName = Bn;
		Email = E;
		//MobileNo = M;
		balance = B;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	/*
	 * public float getMobileNo() { return MobileNo; }
	 * 
	 * public void setMobileNo(float mobileNo) { MobileNo = mobileNo; }
	 */
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [AccountNo=" + AccountNo + ", CustomerName=" + CustomerName + "]";
	}
	
	
	
	
}
