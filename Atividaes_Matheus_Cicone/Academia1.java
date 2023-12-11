package Atividaes_Matheus_Cicone;

import java.util.Scanner;

public class Academia1 {
	public int CPF;
	public String NomeCompleto;
	public int Telefone;
	public int Idade;
	public float Altura;
	public float Peso;
	
	/// getters
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int c) {
		CPF = c;
	}
	
	public String getNomeCompleto() {
		return NomeCompleto;
	}
	public void setNomeCompleto(String n) {
		NomeCompleto = n;
	}
	
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int t) {
		Telefone = t;
	}
	
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int i) {
		Idade = i;
	}
	
	public float getAltura() {
		return Altura;
	}
	public void setAltura(float a) {
		Altura = a;
	}
	
	public float getPeso() {
		return Peso;
	}
	public void setPeso(float p) {
		Peso = p;
	}
	public void calcular_IMC() {
		float resultado = Peso / (Altura*Altura);
		System.out.println("resultado" + resultado);
	}
	
	
}
