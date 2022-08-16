package conversordemoedas;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double dollar, quantidade;
		
		
		
		
		System.out.println("Qual é o preço do Dólar hoje? ");
		dollar = sc.nextDouble();
		
		System.out.println("Quantos Dólares você quer comprar");
		quantidade = sc.nextDouble();
		
		double valor = CurrencyConverter.converter(dollar, quantidade);
		
		System.out.printf("Valor a ser pago em reais %.2f%n ", valor);
		
		sc.close();
	}
	
}