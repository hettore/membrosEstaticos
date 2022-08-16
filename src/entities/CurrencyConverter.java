package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double converter(double dollarPrice, double quantidade) {
		return dollarPrice * quantidade * (1.0 + IOF);
	}
	
	
}
