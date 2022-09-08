package ATM_Program;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionsMenu extends Accounts {
	Scanner menuInput = new Scanner(System.in);
	
	int selection;
	
	//Input Currency Format
	DecimalFormat currencyFormat = new DecimalFormat("'$'###, ##0.00");
	
	//To Store Account No and Password
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
	
	
	/* Validate User Account Number and Password */
	public void getLogIn() throws IOException {
			int x = 1;
			do{try {
				
				data.put(418832, 18832);
				data.put(518833, 18833);
				
				System.out.println("Welcome to the ATM Project");

				
				
				System.out.println("Enter your Account No: ");
				setAccountNumber(menuInput.nextInt());
				
				System.out.println("Enter you account PIN number: ");
				setAccountPINNumber(menuInput.nextInt());
				
				
			}catch (Exception e) {
				System.out.println("\n" + "Invalid Character(s). Only Numbers allowed."+"\n");
				x = 2;
			}
			
			if(check())  getAccountType();
			else System.out.println("Wrong pin or account number");	
			
			}while(x==1);
	}
	
	
	public boolean check() {
		for(Entry<Integer, Integer> entry : data.entrySet()) {
			if(entry.getKey() == getAccountNumber() && entry.getValue() == getAccountPINNumber()) {
				return true;
			}

		}
		return false;
	}
	
	public void getAccountType() {
		System.out.println("Select the Account type that you want to access: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice :");
		selection = menuInput.nextInt();
		
		switch (selection) {
		
		case 1: 
			getCurrent();
			break;
			
		case 2:
			getSavings();
			break;
			
		case 3:
			thanks();
			break;
			
		default:
			System.out.println("\n"+"Please! Enter valid option."+"\n");
			getAccountType();
		
		}		
	}
	
	public void getCurrent() {
		System.out.println("Current Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Cash Withdraw");
		System.out.println("Type 3 - Deposit Cash");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice :");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		
		case 1: 
			System.out.println("Current Account Balance : "+currencyFormat.format(getCurrentBalance()));
			getAccountType();
			break;
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;
		case 4:
			thanks();
			break;
		default:
			System.out.println("\n"+"Please! Enter valid option."+"\n");
			getCurrent();
		}
		
	}
		public void getSavings() {
			
			System.out.println("Saving Account : ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Cash Withdraw");
			System.out.println("Type 3 -  Deposit Cash");
			System.out.println("Type 4 - Exit");
			System.out.print("Choice :");
			
			selection = menuInput.nextInt();
			
			
			switch (selection) {
			
			case 1: 
				System.out.println("Current Account Balance : "+currencyFormat.format(getSavingsBalance()));
				getAccountType();
				break;
			case 2:
				getSavingsWithdrawInput();
				getAccountType();
				break;
				
			case 3: 
				getSavingsDepositInput();
				getAccountType();
				break;
				
			case 4:
				thanks();
				break;
				
			default:
				System.out.println("\n"+"Please! Enter valid option."+"\n");
				getSavings();
			}
			
		}
		
		public void thanks() {
			System.out.println("Thanks for visiting our ATM. Have a nice day! :-) ");
		}
	}
	

