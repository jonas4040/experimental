package jonas4040.cursojavabasico.aula43.labs;

public class ContaBancariaTeste {//TODO ISSUE problema com os dados da conta

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Adalto",122,1100);
		ContaBancaria poupanca = new ContaPoupanca(0.05);
		ContaBancaria especial = new ContaEspecial();
		
		poupanca.setNomeCliente("Joao");
		poupanca.setNumConta(130);
		poupanca.setSaldo(1000);
		
		especial.setNomeCliente("Maria");
		especial.setNumConta(100);
		especial.setSaldo(300);
		
		System.out.println(conta);
		System.out.println(poupanca);
		System.out.println(especial);
		
		conta.depositar(100.00, poupanca);
		especial.sacar(300);
		poupanca.sacar(300);
		
		System.out.println("Valores atualizados:");
		System.out.println(conta);
		System.out.println(poupanca);
		System.out.println(especial);
	}

}
