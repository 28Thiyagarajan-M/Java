package ATM_Program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
	Scanner input = new Scanner(System.in);
	
	DecimalFormat currencyFormat = new DecimalFormat("'$'###, ##0.00");
	
	
	private int accountNumber;
	private int accountPINNumber;
	private double currentBalance;
	private double savingsBalance;

	//Get Account Number
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//Set Account Number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//Get Account PIN Number
	public int getAccountPINNumber() {
		return accountPINNumber;
	}
	
	//Set Account Number
	public void setAccountPINNumber(int accountPINNumber) {
		this.accountPINNumber = accountPINNumber;
	}
	
	
	//Get Current Account Balance
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	//Set Current Account Balance
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	//Get Savings Account Balance
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	//Set Savings Account Balance
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public double calcCurrentWithdraw(double amount) {
		currentBalance = currentBalance - amount;
		return currentBalance;
	}
	
	public double calcSavingsWithdraw(double amount) {
		savingsBalance = savingsBalance - amount;
		return savingsBalance;
	}
	
	public double calcSavingsDeposit(double amount) {
		savingsBalance = savingsBalance + amount;
		return savingsBalance;
	}
	

	public double calcCurrentDeposit(double amount) {
		currentBalance = currentBalance + amount;
		return currentBalance;
	}
	
	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance : "+ currencyFormat.format(currentBalance));
		System.out.print("Enter the Amount that you want to be withdraw: ");
		double amount = input.nextDouble();
		
		if(currentBalance - amount >=0 ) {
			calcCurrentWithdraw(amount);
			System.out.println("New Balace in Your Current Account is : "+currencyFormat.format(currentBalance));
		}else {
			System.out.println("Balance can't be negative");
		}
	}
	

	public void getSavingsWithdrawInput() {
		System.out.println("Savings Account Balance : "+ currencyFormat.format(savingsBalance));
		System.out.print("Enter the Amount that you want to be withdraw: ");
		double amount = input.nextDouble();
		
		if(savingsBalance - amount >=0 ) {
			calcSavingsWithdraw(amount);
			System.out.println("New Balace in Your Savings Account is : "+currencyFormat.format(savingsBalance));
		}else {
			System.out.println("Balance can't be negative");
		}
	}
	
	
	public void getSavingsDepositInput() {
		System.out.println("Savings Account Balance : "+ currencyFormat.format(savingsBalance));
		System.out.print("Enter the Amount that you want to deposit: ");
		double amount = input.nextDouble();
		
		if(amount >= 500 ) {
			calcSavingsDeposit(amount);
			System.out.println("New Balace in Your Savings Account is : "+currencyFormat.format(savingsBalance));
		}else {
			System.out.println("Please Enter the deposit amount more than 500");
		}
	}
	

	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance : "+ currencyFormat.format(currentBalance));
		System.out.print("Enter the Amount that you want to deposit: ");
		double amount = input.nextDouble();
		
		if(amount >= 500 ) {
			calcCurrentDeposit(amount);
			System.out.println("New Balace in Your Current Account is : "+currencyFormat.format(currentBalance));
		}else {
			System.out.println("Please Enter the deposit amount more than 500");
		}
	}
	
	
	
}
