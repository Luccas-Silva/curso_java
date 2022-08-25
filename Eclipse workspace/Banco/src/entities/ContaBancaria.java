package entities;

public class ContaBancaria {
	
	public String titular;
	public int numConta;
	public double saldo;
	
	public void Sacar (double valor) {
		saldo -= valor;
	}
	
	public void Deposito (double valor) {
		saldo += valor;
	}
	
	public void Transferencia (double valor, ContaBancaria contaDestino) {
		Sacar (valor);
		contaDestino.Deposito(valor);
	}

}
