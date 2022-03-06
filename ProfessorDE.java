package Professores;

public class ProfessorDE extends Professor{
	double bonus;
	
	ProfessorDE(String nome, int siape, int cpf, double salario, double bonus){
		super(nome, siape, cpf, salario);
		this.bonus = bonus;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + this.bonus;
	}
	
	@Override
	public void imprime() {
		System.out.printf("Nome: %s\nSiape: %d\nCPF: %d\nSalario: %.3f\nBonus: %.2f\n", super.getNome(), super.getSiape(), super.getCPF(), super.getSalario(), this.bonus);
	}
}
