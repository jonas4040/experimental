package jonas4040.cursojavabasico.aula43.labs;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria() {}

	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	//getters & setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodos
	public void sacar(double valor) {
		this.saldo-=valor;
	}
	
	public void depositar(double valor,ContaBancaria destinatario) {
		destinatario.setSaldo(valor+destinatario.getSaldo());
		this.sacar(valor);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("\tDados da Conta\n");
		str.append("\n\t Nome do cliente: ").append(this.nomeCliente).
			append("\n\t Numero da Conta: ").append(this.numConta).
			append("\n\t Saldo: R$").append(this.saldo).append("\n");
		return str.toString();
	}
	
}
