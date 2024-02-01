// git change
package entity;
import java.util.Scanner;

public class Customer {

	double amount=500;
	Scanner sc=new Scanner(System.in);
	public Customer(){
		
	}
	
	
	
	public synchronized double deposit(double amount) {
		System.out.println("Enter Amount You Want To Deposit");
		amount=sc.nextInt();
		this.amount+=amount;
	
		System.out.println("Deposit Successfully");
		notify();
		return amount;
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("Enter Amount You Want to Withdraw");
		if(this.amount<amount) {
			System.out.println("Less Balance");
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		
	
		if(this.amount>amount) {
		this.amount -= amount;
		System.out.println("Withdraw Successfully");
		}
		else {
			System.out.println("Less Amount");
		}
}
	public void balcheck() {
		System.out.println("Your Current Amount is" +amount);
	}
}
