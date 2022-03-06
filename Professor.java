package Professores;

public class Professor {
	private String nome;
	private int siape;
	private int cpf;
	private double salario;
	
	//Construtor "default"
	Professor(){
		this.nome 	 = "";
		this.siape   = 0;
		this.cpf 	 = 0;
		this.salario = 0.0;
	}
	
	Professor(String nome, int siape, int cpf, double salario){
		this.nome    = nome;
		this.siape   = siape;
		this.cpf 	 = cpf;
		this.salario = salario;
	}
	
	public void aumento(double p) {
		this.salario += this.salario * p/100;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getSiape() {
		return this.siape;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void imprime() {
		System.out.printf("Nome: %s\nSiape: %d\nCPF: %d\nSalario: %.3f\n", this.nome, this.siape, this.cpf, this.salario);
	}
}
