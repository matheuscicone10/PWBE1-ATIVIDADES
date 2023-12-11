package Atividaes_Matheus_Cicone;

public class Pessoa {
//	atributos
	public String Nome;
	public String Endereco;
	public int Telefone;
	public int CPF;
	public int Celular;
	
//	getters e setters
	public String getNome() {
		return Nome;
	}
	public void setNome(String n) {
		this.Nome = n;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String e) {
		this.Endereco = e;
	}
	
	public int getTelelfone() {
		return Telefone;
	}
	public void setTelefone(int t) {
		this.Telefone = t;
	}
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int c) {
		this.CPF = c;
	}
	
	public int getCelular() {
		return Celular;
	}
	public void setCelular(int l) {
		this.Celular = l;
	}

}
