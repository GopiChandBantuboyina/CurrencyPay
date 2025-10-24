package com.gopi.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class NamePropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
			 
		//System.out.println("Inside custom propertyEditor method.");
		Currency currency=Currency.getInstance(text.toUpperCase());
		
		setValue(currency);
		
	}
	
	
}
