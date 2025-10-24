package com.gopi.converters;

import org.springframework.core.convert.converter.Converter;

import com.gopi.servlet.api.CardNumber;

public class CreditCardConverter implements Converter<String, CardNumber>{

	@Override
	public CardNumber convert(String source) {
		
		String[] num=source.split("-");
		
		CardNumber cardNumber=new CardNumber();
		
		cardNumber.setFirstFour(new Integer(num[0]));
		cardNumber.setSecondFour(new Integer(num[1]));
		cardNumber.setThirdFour(new Integer(num[2]));
		cardNumber.setFourthFour(new Integer(num[3]));
		
		return cardNumber;
	}
	

}
