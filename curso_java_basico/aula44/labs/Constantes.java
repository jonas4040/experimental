/*
 * Tabela Atualizada IRPF 2022
 * disponivel em: https://www.ministeriodotrabalho.org/imposto-de-renda-aliquotas-e-tabela-atualizada-do-irpf/
 * 
 * Base de cálculo			Alíquota	Dedução
de 0,00 até 1.903,98		isento		0,00  	--> ISENTO
de 1.903,99 até 2.826,65	7,50%		142,80	--> GRUPO 1 
de 2.826,66 até 3.751,05	15,00%		354,80	--> GRUPO 2
de 3.751,06 até 4.664,68	22,50%		636,13	--> GRUPO 3
a partir de 4.664,69		27,50%		869,36	--> GRUPO 4

Valor de dependentes: 189,59
 *
 *
*/

package jonas4040.cursojavabasico.aula44.labs;

public final class Constantes {
	public static final double ALIQUOTA_EMPRESA = 0.1;
	public static final double ALIQUOTA_ISENTO = 0.0;
	public static final double ALIQUOTA_GRUPO1 = 0.075;
	public static final double ALIQUOTA_GRUPO2 = 0.15;
	public static final double ALIQUOTA_GRUPO3 = 0.225;
	public static final double ALIQUOTA_GRUPO4 = 0.275;
	
	public static final double TETO_MAX_ISENTO = 1903.98;
	public static final double TETO_MIN_GRUPO1 = 1903.99;
	public static final double TETO_MAX_GRUPO1 = 2826.65;
	public static final double TETO_MIN_GRUPO2 = 2826.66;
	public static final double TETO_MAX_GRUPO2 = 3751.05;
	public static final double TETO_MIN_GRUPO3 = 3751.06;
	public static final double TETO_MAX_GRUPO3 = 4664.68;
	public static final double TETO_MIN_GRUPO4 = 4664.69;

	/*
	 * VALORES DA ATIVIDADE SOBRE IMPOSTO DE RENDA
	 * public static final double ALIQUOTA_EMPRESA = 0.1;
	public static final double ALIQUOTA_ISENTO = 0.0;
	public static final double ALIQUOTA_GRUPO1 = 0.1;
	public static final double ALIQUOTA_GRUPO2 = 0.15;
	public static final double ALIQUOTA_GRUPO3 = 0.25;
	public static final double ALIQUOTA_GRUPO4 = 0.3;
	
	public static final double TETO_MAX_ISENTO = 1400;
	public static final double TETO_MIN_GRUPO1 = 1400.01;
	public static final double TETO_MAX_GRUPO1 = 2100;
	public static final double TETO_MIN_GRUPO2 = 2100.01;
	public static final double TETO_MAX_GRUPO2 = 2800;
	public static final double TETO_MIN_GRUPO3 = 2800.01;
	public static final double TETO_MAX_GRUPO3 = 3600;
	public static final double TETO_MIN_GRUPO4 = 3600.01; 
	*/
}
