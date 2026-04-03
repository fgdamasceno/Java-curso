package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double currencyValue, double currencyQuantity) {
		double usdToReal = currencyValue * currencyQuantity;
		return usdToReal + usdToReal * IOF;
		
	}

}
