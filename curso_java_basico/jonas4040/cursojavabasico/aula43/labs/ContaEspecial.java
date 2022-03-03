package jonas4040.cursojavabasico.aula43.labs;

public class ContaEspecial extends ContaBancaria{
	private double limite=400.00;
	
	public ContaEspecial() {super();}
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	//getters & setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	
	@Override
	public void sacar(double valor) {
		if(valor<this.getLimite() && valor<this.getSaldo())
			super.sacar(valor);
		else
			System.out.println("Por enquanto voce nao pode sacar mais que R$"+limite);
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s+="\t Limite R$"+limite+"\n";
		return s;
	}
}
