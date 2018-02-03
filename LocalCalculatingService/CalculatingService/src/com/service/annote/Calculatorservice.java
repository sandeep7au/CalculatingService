package com.service.annote;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="CalculatorCatalog")
public class Calculatorservice {
	
	@WebMethod
	public int add(int a, int b)
	{
		return a+b;
	}

}
