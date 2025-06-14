package model.entities;

import model.exception.MinhaException;


public class Account {
			
	private String holder;
	private Double balance;
	private Double withdrawLimit ;
	private Integer number;
	
	
	private static final String NAME_REGEX = "^[A-Za-zÀ-ÿ ]+$";
	
	public Account() {}
	
	public Account(String holder, Double balance, Double withdrawLimit, Integer number)  throws MinhaException{
		if (holder == null || !holder.matches(NAME_REGEX)) {
            throw new MinhaException(
                "Nome do titular inválido! Use apenas letras e espaços.");
        }
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
		this.number = number;
	}
	
	
	
	

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	
	public void deposit(Double amount) throws MinhaException {
		if (amount < 0) {
			throw new MinhaException( "Depósito inválido");
		}
		balance += amount;
		
	}
	
	public void withdraw(Double amount) throws MinhaException{
		if ( amount > balance) {
			throw new MinhaException(" Valor de saque maior que o seu saldo");	
			}
		if ( amount > withdrawLimit) {
			throw new MinhaException(" Valor maior que o limite de saque");
		}
		if ( amount < 0) {
			throw new MinhaException(" só e possível sacar valores positivos");
		}
			balance -= amount;
	}
	
	
	
}


