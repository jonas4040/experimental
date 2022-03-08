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

	public void setNome(String nome) {
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

	public double calcularImposto(double salario) {
		//double deducao = 0.0;
		double imposto = (salario*this.getAliquota());
		return imposto;
	}
	
	@Override
	public String toString() {
		String str =this.nome;
		str+=", voce tem que pagar R$";
		str+=this.calcularImposto(this.rendaBrutaAnual);
		str+=" de imposto de renda esse ano.";
		
		return str;
	}
	
}
