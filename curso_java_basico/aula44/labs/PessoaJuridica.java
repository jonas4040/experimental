package jonas4040.cursojavabasico.aula44.labs;

public class PessoaJuridica extends Contribuinte{
	
	
	public PessoaJuridica() {}

	public PessoaJuridica(String nome, double rendaBrutaAnual) {
		super(nome, rendaBrutaAnual);
	}

	@Override
	public double calcularImposto(double lucroAnual,double deducao) {
		lucroAnual=super.getRendaBrutaAnual();
		super.setAliquota(Constantes.ALIQUOTA_EMPRESA);
		return super.calcularImposto(lucroAnual,0);
	}
}
