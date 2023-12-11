package Atividaes_Matheus_Cicone;
import java.util.Scanner;
public class Aluno {
//	atributos
	public String Curso;
	public float Nota;
	int media;
	Scanner entrada = new Scanner(System.in);
//	getters e setters	
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String c) {
		this.Curso = c;
	}
	
	public float getNota() {
		return Nota;
	}
	public void setNota(float n) {
		this.Nota = n;
	}
	public void CalcularMedia() {
		System.out.println("entre com o primeira nota:");
		int nota1 = entrada.nextInt();
		System.out.println("entre com a segunda nota:");
		int nota2 = entrada.nextInt();
		media = (nota1+nota2) /2;
		System.out.println("A sua média é:" + media);
	}
	public void SituacaoFinal() {
		if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Não aprovado");
		}
	}
}
