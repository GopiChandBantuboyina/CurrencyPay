package com.gopi.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.gopi.servlet.api.CardNumber;

public class CreditCardEditor extends PropertyEditorSupport {
	
	@Override
	public String getAsText() {
		
		CardNumber c=(CardNumber)getValue();
		return c.toString();
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] num=text.split("-");
		
		CardNumber cardNumber=new CardNumber();
		
		cardNumber.setFirstFour(new Integer(num[0]));
		cardNumber.setSecondFour(new Integer(num[1]));
		cardNumber.setThirdFour(new Integer(num[2]));
		cardNumber.setFourthFour(new Integer(num[3]));
		
		setValue(cardNumber);
		
	}

}
