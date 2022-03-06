package Professores;

public class ProfessorHorista extends Professor{
	private int horas;
	
	ProfessorHorista(String nome, int siape, int cpf, double salario, int horas){
		super(nome, siape, cpf, salario);
		this.horas = horas;
	}
	
	public void addHoras(int hr) {
		this.horas += hr;
	}
	
	public double getSalario() {
		return super.getSalario() * this.horas;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	@Override
	public void imprime() {
		System.out.printf("Nome: %s\nSiape: %d\nCPF: %d\nSalario: %.3f\nHoras: %d\n", super.getNome(), super.getSiape(), super.getCPF(), super.getSalario(), this.horas);
	}
}
