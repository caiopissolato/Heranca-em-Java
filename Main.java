package Professores;

public class Main {
	public static void main(String[] args) {
		Professor 		  p0 = new Professor("Pedro", 333, 26550458, 2.000);
		//Professor 		  p1 = new Professor();
		ProfessorDE 	 pde = new ProfessorDE("Vander", 444, 26550458, 25.000, 2);
		ProfessorHorista phr = new ProfessorHorista("Juca", 555, 26550458, 14.000, 5);
		p0.imprime();
		pde.imprime();
		phr.imprime();
		
		Professor[] staff = new Professor[3];
		staff[0] = p0;
		staff[1] = pde;
		staff[2] = phr;
		
		double soma = 0;
		
		for(Professor prof : staff) {
			soma += prof.getSalario();
		}
		
		System.out.printf("\nSoma dos salarios: %.3f", soma);
		System.out.println();
		phr.addHoras(3);
		phr.imprime();
	}
}