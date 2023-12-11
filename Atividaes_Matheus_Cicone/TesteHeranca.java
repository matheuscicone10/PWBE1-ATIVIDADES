package Atividaes_Matheus_Cicone;

import java.util.Scanner;

public class TesteHeranca extends Pessoa{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Aluno aluno1 = new Aluno();

		Professor prof1 = new Professor();

		System.out.println("Entre com os dados do aluno1:");
		System.out.println("Digite o seu nome: ");
		aluno1.setNome(entrada.next());
		System.out.println("Digite o seu endereco: ");
		aluno1.setEndereco(entrada.next());
		System.out.println("Digite o seu cpf: ");
		aluno1.setCPF(entrada.nextInt());
		System.out.println("Digite o seu telefone: ");
		aluno1.setTelefone(entrada.nextInt());
		System.out.println("Digite o seu celular: ");
		aluno1.setCelular(entrada.nextInt());
		System.out.println("Curso: ");
	    aluno1.setCurso(entrada.next());
		aluno1.calcularMedia();
		aluno1.SituacaoFinal();

		//professor 1
		System.out.println("Entre com os dados do professor1:");
		System.out.println("Digite o seu nome: ");
		prof1.setNome(entrada.next());
		System.out.println("Digite o seu endereco: ");
		prof1.setEndereco(entrada.next());
		System.out.println("Digite o seu cpf: ");
		prof1.setCPF(entrada.nextInt());
		System.out.println("Digite o seu telefone: ");
		prof1.setTelefone(entrada.nextInt());
		System.out.println("Digite o seu celular: ");
		prof1.setCelular(entrada.nextInt());
		System.out.println("Curso: ");
	    prof1.setNomeCurso(entrada.next());
	    System.out.println("salario: ");
	    prof1.setSalario(entrada.nextFloat());

	}

	}
}}
}
