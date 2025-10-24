package com.gopi.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.gopi.servlet.api.CardNumber;

public class CardFormatter implements Formatter<CardNumber>{

	@Override
	public String print(CardNumber object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardNumber parse(String number, Locale locale) throws ParseException {
		
		String[] num=number.split("-");
		
		CardNumber cardNumber=new CardNumber();
		
		cardNumber.setFirstFour(new Integer(num[0]));
		cardNumber.setSecondFour(new Integer(num[1]));
		cardNumber.setThirdFour(new Integer(num[2]));
		cardNumber.setFourthFour(new Integer(num[3]));
		
		return cardNumber;
	}

}
