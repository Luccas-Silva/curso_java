package entities;

public class Retangulo {
	
	public double altura, largura;
	
	public double area() {
		return altura * largura;
	}
	
	public double perímetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}

}
