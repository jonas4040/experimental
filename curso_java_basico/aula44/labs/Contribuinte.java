package jonas4040.cursojavabasico.aula44.labs;

public class Contribuinte {
	private String nome;
	private double rendaBrutaAnual;
	private double aliquota=0;
	
	public Contribuinte() {}

	public Contribuinte(String nome, double rendaBrutaAnual) {
		this.nome = nome;
		this.rendaBrutaAnual = rendaBrutaAnual;
	}
	//getters & setters
	public String getNome() {
		return nome;
	}

	public void setNomeCliente(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBrutaAnual() {
		return rendaBrutaAnual;
	}

	public void setRendaBrutaAnual(double rendaBrutaAnual) {
		this.rendaBrutaAnual = rendaBrutaAnual;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}

	public double calcularImposto() {
		double imposto = this.rendaBrutaAnual*this.aliquota;
		return imposto;
	}
	
	@Override
	public String toString() {
		String str =this.nome;
		str+=", voce tem que pagar R$";
		str+=this.calcularImposto();
		
		return str;
	}
	
}
