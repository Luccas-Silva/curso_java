package entities;

public class Sistema_Lista {
	
	private String codigo;
	private String nome;
	private int quantidade;
	private double valor;
	
	public Sistema_Lista (String codigo, String nome, int quantidade, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public Sistema_Lista () {
	}
	
	public String getCodigo (){
		return codigo;
	}
	public void setCodigo (String codigo){
		this.codigo = codigo;
	}
	
	public String getNome (){
		return nome;
	}
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public int getQuantidade (){
		return quantidade;
	}
	public void setQuantidade (int quantidade){
		this.quantidade = quantidade;
	}
	
	public double getValor (){
		return valor;
	}
	public void setValor (double valor){
		this.valor = valor;
	}
	
	public String toString () {
		return "| Codigo: "+ codigo +" | Nome: "+ nome +" | Quantidade: "+ quantidade +" | Valor: "+ String.format("$%.2f |", valor);
	}

}
