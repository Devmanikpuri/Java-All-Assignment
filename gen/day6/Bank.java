package com.org.gen.day6;

public interface Bank
{
public void deposite(double amount) throws InvalidAmountException;
public double withdraw(double amount) throws InsufficientFundsException;
public void balanceEnquiry();
}
