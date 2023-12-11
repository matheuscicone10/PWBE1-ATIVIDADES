package Atividaes_Matheus_Cicone;

public class Vaso {
	
	
//	atributos
	
	private String Cor;
	private double Tamanho;
	private String Material;
	
	
//	metodo construtor
	
	public Vaso() {
		super();
		System.out.println();
	}
//	metodo construtor c parametro
	public Vaso(String Cor,String Material) {
		super();
		System.out.println("Vaso com cor" + "material do vaso");
	}
	public Vaso(double Tamanho) {
		this.Tamanho = Tamanho;
		System.out.println("Tamanho do Vaso: ");
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String c) {
		this.Cor = c;
	}
//	getters e setters	
	
	public double getTamanho() {
		return Tamanho;
	}
	public void setTamanho(double t) {
		this.Tamanho = t;
	}
	
	public String getMaterial() {
		return Material;
	}
	public void setMaterial(String m) {
		this.Material = m;
	}
	public void exibirInfo(String cor2, String material2, double tamanho2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
