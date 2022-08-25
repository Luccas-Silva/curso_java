package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double ValorAPagar (double valorDolar , double dolaresComprados) {
		return dolaresComprados * valorDolar * (1.0 + IOF);
	}
}
