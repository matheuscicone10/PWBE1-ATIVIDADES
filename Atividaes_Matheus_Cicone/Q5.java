package Atividaes_Matheus_Cicone;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		double resultado;
		
		do {
			exibirMenu(); // metodo (acao)
			num1 = entrada.nextInt();
			switch(num1) {
				case 1:
					System.out.println("soma");
					System.out.println("digite o numero 1: ");
					double num11 = entrada.nextDouble();
					System.out.println("digite o numero 2: ");
					resultado = num11 + num2;
					System.out.println("resultado =" + resultado);
					break;
				case 2:
					System.out.println("subtracao");
					System.out.println("digite o numero 1: ");
					double num11 = entrada.nextDouble();
					System.out.println("digite o numero 2: ");
					resultado = num11 + num2;
					System.out.println("resultado =" - resultado);
					break;
				case 3:
					System.out.println("multiplicacao");
					System.out.println("digite o numero 1: ");
					double num1 = entrada.nextDouble();
					System.out.println("digite o numero 2: ");
					resultado = num1 + num2;
					System.out.println("resultado =" * resultado);
					break;
				case 1:
					System.out.println("divisao");
					System.out.println("digite o numero 1: ");
					double num1 = entrada.nextDouble();
					System.out.println("digite o numero 2: ");
					resultado = num1 + num2;
					System.out.println("resultado =" / resultado);
					break;
				default:
					System.out.println("ERRO");
					break;
		}
		System.out.println();
		
	}while(num1 != 0);
		
	}
		
		//metodo para exibir menu de opções (fora do main)
		public static void exibirMenu() {
			System.out.println("1- soma");
			System.out.println("2- subtracao");
			System.out.println("3- multiplicacao");
			System.out.println("4- divisao");
			System.out.println("0 - SAIR");
	}

}
