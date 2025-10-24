package com.gopi.BCControllers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gopi.propertyeditor.CreditCardEditor;
import com.gopi.propertyeditor.NamePropertyEditor;
import com.gopi.servlet.api.BillCalculator;
import com.gopi.servlet.api.CardNumber;

@Controller
public class BillCalculatorController {
	
	
	
	@RequestMapping("/")
	public String homePage(@ModelAttribute("bill") BillCalculator billCalculator)
	{
		//System.out.println("inside homepage controller");
		CardNumber c=new CardNumber();
		c.setFirstFour(1234);
		c.setSecondFour(5678);
		c.setThirdFour(8976);
		c.setFourthFour(5674);
		
		billCalculator.setCardNumber(c);
		
		return "home-page";
	}
	
	@RequestMapping("/bill-success")
	public String billCalculate(@Valid @ModelAttribute("bill") BillCalculator billCalculator,BindingResult result)
	{
		if(result.hasErrors())
		{
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError error:allErrors)
			{
				System.out.println(error);
			}
			
			return "home-page";
		}
		//System.out.println("inside result-page controller");
		
		return "billCalculate";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//to access date in 12-08-2025 in this format also basically it accept like 12/08/2025
		
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		
		CustomDateEditor custom=new CustomDateEditor(format, true);
		
		binder.registerCustomEditor(Date.class,"date",custom);
		
		//to enter amount in user easily used this NumberFormat
		
		NumberFormat number=new DecimalFormat("##,###.00");
		
		CustomNumberEditor editor=new CustomNumberEditor(Double.class,number ,true);
		
		binder.registerCustomEditor(Double.class, "amount",editor);
		
		
		//convert text to upper
		
		NamePropertyEditor nameEditor=new NamePropertyEditor();
		
		binder.registerCustomEditor(Currency.class,"currency",nameEditor);
		
		
		//binder.addCustomFormatter(new CardFormatter());
		//CreditCardEditor credit=new CreditCardEditor();
		//binder.registerCustomEditor(CardNumber.class,"cardNumber" ,credit);
		
		
		
	}
}
