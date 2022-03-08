package jonas4040.cursojavabasico.aula44.labs;

public class PessoaFisica extends Contribuinte{
	public PessoaFisica() {}
	
	public PessoaFisica(String nome, double salario) {
		super.setNome(nome);
		super.setRendaBrutaAnual(salario);
	}
	
	@Override
	public double calcularImposto(double salario) {
		double deducao =0.0;
		salario=this.getRendaBrutaAnual();
		if(salario>=0 && salario<=Constantes.TETO_MAX_ISENTO) {
			super.setAliquota(Constantes.ALIQUOTA_ISENTO);
		}else if(salario>=Constantes.TETO_MIN_GRUPO1 && salario<=Constantes.TETO_MAX_GRUPO1) {
			super.setAliquota(Constantes.ALIQUOTA_GRUPO1);
			deducao = Constantes.DEDUCAO_GRUPO1;
		}else if(salario>=Constantes.TETO_MIN_GRUPO2 && salario<=Constantes.TETO_MAX_GRUPO2) {
			super.setAliquota(Constantes.ALIQUOTA_GRUPO2);
			deducao = Constantes.DEDUCAO_GRUPO2;
		}else if(salario>=Constantes.TETO_MIN_GRUPO3 && salario<=Constantes.TETO_MAX_GRUPO3) {
			super.setAliquota(Constantes.ALIQUOTA_GRUPO3);
			deducao = Constantes.DEDUCAO_GRUPO3;
		}else if(salario>=Constantes.TETO_MIN_GRUPO4) {
			super.setAliquota(Constantes.ALIQUOTA_GRUPO4);
			deducao = Constantes.DEDUCAO_GRUPO4;
		}else {
			System.out.println("Salario nao pode ser negativo.");
		}
		return super.calcularImposto(salario) - deducao;
	}
}
