package jonas4040.cursojavabasico.aula43.labs;

public class ContaPoupanca extends ContaBancaria{
	private double rendDiario;
	
	public ContaPoupanca() {super();}

	public ContaPoupanca(double rendDiario) {
		super();
		this.rendDiario = rendDiario;
	}
	
	//getters & setters
	public double getRendDiario() {
		return rendDiario;
	}

	public void setRendDiario(double rendDiario) {
		this.rendDiario = rendDiario;
	}
	
	//metodos
	public void calcularNovoSaldo(double taxaRendimento) {
		this.setSaldo(this.getSaldo()*(1+taxaRendimento));
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s+="\t Rendimento Diario: "+rendDiario+" %\n";
		return s;
	}
}
