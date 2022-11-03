package banksystem;
import entity.Customer;

import java.util.Scanner;

	
public class Menu {

	static int option;
	static double amount;
	
	public void option() {
		Customer cur=new Customer();
		Scanner sc=new Scanner(System.in);
		do {
		  System.out.println("1.DEPOSIT");
	      System.out.println("2.CASH WITHDRAW");
	      System.out.println("3.BALCHECK");
	      System.out.println("4.EXIT");
	      System.out.println("Choose One Option");
	      option=sc.nextInt();
		switch(option) {    
		  case 1:
			  cur.deposit(amount);
			  cur.balcheck();
		
			  break;
			    
		  case 2:
			  
			  cur.withdraw(amount);
			  cur.balcheck();
			  break;
		  case 3:
			  
			  cur.balcheck();
			  break;
		  case 4:

			  System.out.println("Thank You");
			  System.exit(0);
		}
		}while(option>0);	
	}
}
