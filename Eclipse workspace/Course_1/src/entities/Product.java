package entities;

public class Product {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public Product (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Product (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString( ) {
		return nome+ ". $ " +String.format("%.2f", preco)+ ". " +quantidade
				+ " unidades, Total: $ " +String.format("%.2f", totalValorEstoque());
		
	}

}
