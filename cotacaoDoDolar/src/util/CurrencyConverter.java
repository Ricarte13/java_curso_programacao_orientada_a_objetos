package util;

public class CurrencyConverter {
	
	public static double IOF = 6.00 / 100;
	
	public static double totalQuantityInReais(double dolarPrice, double dolarQuantity) {
		return (dolarQuantity  * IOF + dolarQuantity) * dolarPrice;
	}

	
}
