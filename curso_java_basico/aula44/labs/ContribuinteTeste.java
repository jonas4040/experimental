/*
 * Tabela Atualizada IRPF 2022
 * disponivel em: https://www.ministeriodotrabalho.org/imposto-de-renda-aliquotas-e-tabela-atualizada-do-irpf/
 * 
 * Base de cálculo			Alíquota	Dedução
de 0,00 até 1.903,98		isento		0,00
de 1.903,99 até 2.826,65	7,50%		142,80
de 2.826,66 até 3.751,05	15,00%		354,80
de 3.751,06 até 4.664,68	22,50%		636,13
a partir de 4.664,68		27,50%		869,36

Valor de dependentes: 189,59
 *
 *
 */
package jonas4040.cursojavabasico.aula44.labs;

public class ContribuinteTeste {

	public static void main(String[] args) {
		Contribuinte jonas = new Contribuinte("Jonas", 10000);
		
		System.out.println(jonas);
	}

}
