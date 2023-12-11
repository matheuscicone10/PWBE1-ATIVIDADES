package Atividaes_Matheus_Cicone;

import java.util.Scanner;

public class TesteVaso2 {
	public static void main(String[]args);
	Scanner entrada = new Scanner (System.in);
	ArrayList <Vaso> vasos = new ArrayList<>();
	for (int i=0; i < 2; i++) {
		System.out.println("Digite o nome da cor: " + (i + 1) + ":");
		String Cor = entrada.next();
		System.out.println("Escolha o tamanho do vaso" + "(pequeno e grande)");
		double Tamanho = entrada.nextDouble();
		System.out.println("Qual o material ");
		String Material = entrada.next();
		Vaso vaso;
		vaso = new Vaso(Cor, Material);
		for(Vaso vaso1 : vasos) {
			System.out.println("Nome da cor: " + vaso1.getCor);
		}vaso.exibirInfo(Cor, Material, Tamanho);
	}
}
}