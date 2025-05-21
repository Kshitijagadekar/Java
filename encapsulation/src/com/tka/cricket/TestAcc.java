package com.tka.cricket;

public class TestAcc {

	public static void main(String[] args) {

		Account AA = new Account(123456789,"Kshitija","Bank of India", "kshitija@gmail.com", 1000000 );
		Account AA1 = new Account(234567891, "Shravya","Bank of India", "shravya@gmail.com", 2000000);
		
		AA.setAccountNo(123456789);
		AA.setCustomerName("Kshitija");
		AA.setBankName("Bank of India");
		AA.setEmail("kshitija@gmail.com");
		//AA.setMobileNo(8989898989);
		AA.setBalance(1000000);
		
		System.out.println("Account No : " +  AA.getAccountNo());
		System.out.println("CustomerName : " + AA.getCustomerName());
		System.out.println("BankName : " + AA.getBankName());
		System.out.println("Email ID : " + AA.getEmail());
		System.out.println("balance : " + AA.getBalance());
		
		System.out.println("Account No : " + AA1.getAccountNo());
		
		System.out.println("Customer Name : " + AA1.getCustomerName());
	}

}
