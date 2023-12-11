package Atividaes_Matheus_Cicone;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
//	instancia do objda clase vaso
		Scanner entrada = new Scanner(System.in);
		Vaso vaso1 = new Vaso();
		System.out.println("Qual a cor? ");
		String cor1 = entrada.next();
		Vaso.setCor(Cor);
		System.out.println("Qual o tamanho? ");
		double Tamanho = entrada.nextDouble();
		Vaso.setTamanho(Tamanho);
		System.out.println("Qual o material? ");
		String Material = entrada.next();
		Vaso.setMaterial(Material);String Material = entrada.next();
	}

}
