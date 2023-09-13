package org.roy.Intership;

import java.util.*;
class User{
	/*static Scanner sc=new Scanner(System.in);
	static double balance = 100000.00;
	static int pin=sc.nextInt();
	ATM atm=new ATM();
	//atm.manu();*/
}
//atm class (working as interface to the enduser)
class ATM {
	static Scanner sc = new Scanner(System.in);
	static ATMFunctions af = new ATMFunctions();
	
	static double balance = 100000.00;
	static int pin = 1234;
	public static void manu() {

		System.out.println("enter your optino");
		System.out.println("option 1: to check blance");
		System.out.println("option 2: to withdraw money");
		System.out.println("option 3: to diposite ammount");
		System.out.println("option 4: exit ");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			af.checkBlance();
			break;
		case 2:
			af.withdrawMoney();
			break;
		case 3:
			af.dipositeMoney();
			break;
		case 4:
			af.exit();
			break;
		}

	}

}

//atm functions (manu , check balance, withdraw, deposite, exit )
class ATMFunctions {
	//static User a = new User();
	static ATM a=new ATM();
	static Scanner sc = new Scanner(System.in);

	public static void checkBlance() {
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if (pin == a.pin)
			System.out.println(a.balance);
		else
			System.out.println("invalid pin");

		a.manu();
	}

	public void withdrawMoney() {
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if (pin == a.pin) {
			System.out.println("enter your ammount");
			double ammount = sc.nextDouble();
			if (ammount >a.balance) {
				System.out.println("insafient balance your balance :"+a.balance);
			}
			else{
				a.balance=a.balance-ammount;
				System.out.println(ammount+" has been dabited collect your ammount");
			}
		} else
			System.out.println("invalid pin");

		a.manu();
	}

	public static void dipositeMoney() {
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		if(pin==a.pin) {
			System.out.println("enter your ammomunt you want to deposite ");
			double DAmmount=sc.nextDouble();
			a.balance=a.balance+DAmmount;
			System.out.println("your ammount has been added to your account ");
		}else
			System.out.println("invalid pin ");
		a.manu();
	}

	public void exit() {

		System.out.println("thanku for visiting our ATM (name) ");
	}
}

//main () to call the ATM class 
public class ATMmachine {
	public static void main(String[] args) {
		ATM atm = new ATM();
		System.out.println("welcome to (name) ATM");
		atm.manu();
	}
}
