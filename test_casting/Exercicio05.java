package test_casting;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int codigoPrimeiroProduto, quantidadeDoPrimeiroProduto;
		double valorUnitarioDoPrimeiroProduto;
		
		System.out.print("Digite o codigo do primeiro produto: ");
		codigoPrimeiroProduto = scanner.nextInt();
		
		System.out.print("Digite a quantidade desejada: ");
		quantidadeDoPrimeiroProduto = scanner.nextInt();
		
		System.out.print("Digite o valor da unidade: ");
		valorUnitarioDoPrimeiroProduto = scanner.nextDouble();
		
		int codigoSegundoProduto, quantidadeDoSegundoProduto;
		double valorUnitarioDoSegundoProduto;
		
		System.out.print("Digite o codigo do segundo produto: ");
		codigoSegundoProduto = scanner.nextInt();
		
		System.out.print("Digite a quantidade desejada: ");
		quantidadeDoSegundoProduto = scanner.nextInt();
		
		System.out.print("Digite o valor da unidade: ");
		valorUnitarioDoSegundoProduto = scanner.nextDouble();
		
		double total;
		
		total = (quantidadeDoPrimeiroProduto * valorUnitarioDoPrimeiroProduto) + (quantidadeDoSegundoProduto * valorUnitarioDoSegundoProduto);
		
		System.out.printf("VALOR A PAGA = R$ %.2f%n", total);
		
		
		
		scanner.close();
		
	}

}
