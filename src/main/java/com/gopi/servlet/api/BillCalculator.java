package com.gopi.servlet.api;

import java.util.Currency;
import java.util.Date;

public class BillCalculator {
	
	private CardNumber cardNumber;
	private Double amount;
	private Currency currency;
	private Date date;
	
	public CardNumber getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(CardNumber cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
