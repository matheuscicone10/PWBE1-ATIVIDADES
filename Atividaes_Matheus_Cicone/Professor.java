package Atividaes_Matheus_Cicone;

public class Professor extends Pessoa{
//	atributos
	public String NomeCurso;
	public float Salario;
//	construtor
	public Professor() {
		super();
	}
	public Professor(String NomeCurso, float Salario) {
		this.NomeCurso = NomeCurso;
		this.Salario = Salario;
	}
//	getters e setters
	public String getNome() {
		return NomeCurso;
	}
	public void setNome(String n) {
		this.NomeCurso = n;
	}
	
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float s) {
		this.Salario = s;
	}
}
