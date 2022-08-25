package entities;

public class Sistema_Banco {
	
	private int numConta;
	private String nomeConta;
	private double conta;
	
	public int getNumConta () {
		return numConta;
	}
	
	public void setNumConta (int numConta) {
		this.numConta = numConta;
	}
	
	public String getNomeConta () {
		return nomeConta;
	}
	
	public void setNomeConta (String nomeConta) {
		this.nomeConta = nomeConta;
	}
	
	public double getConta () {
		return conta;
	}
	
	public void Deposido (double valor) {
		conta += valor;
	}
	
	public void Saque (double valor) {
		conta -= valor + 5.0 ;
	}
	
	public String toString() {
		return "Conta " +numConta+ ", titular: " +nomeConta+ ", saldo: $ " +conta;
	}

}
