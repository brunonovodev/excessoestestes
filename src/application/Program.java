package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.MinhaException;

public class Program {

	public static void main(String[] args) throws MinhaException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Number");
		Integer number = sc.nextInt();
		System.out.print("Holder");
		sc.nextLine()	;
		String  holder = sc.nextLine()	;
		System.out.print("Balance");
		Double balance = sc.nextDouble()	;
		System.out.print("WhithdrawLimit");
		Double withdrawLimit = sc.nextDouble()	;
		
		
		Account acc = new Account(holder, balance, withdrawLimit, number);
	
		System.out.println();
		System.out.println("*******************************");
		
		System.out.print("Informe um valor para saque");
		double amount = sc.nextDouble()	;
		
		
		try {
			acc.withdraw(amount);
			System.out.println(acc.getBalance());
		}
		catch (MinhaException e ){
			System.out.println("opa!, tivemos um erro aqui" + e.getMessage());
			
		}
		

	}

}
