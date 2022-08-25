package entities;

public class Estudante {
	
	public String nomeAluno;
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public double pontosFaltando() {
		return 100.00 - notaFinal();
	}


}
