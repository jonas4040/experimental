import java.util.Scanner;

public class SalarioBonus{//exercicio 1009
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double salario,totVendas, comissao, total;//salario, total de vendas, etc
		String nome, nxtLn;//nome e quebra de linha
		
		nome=sc.nextLine();
		salario=sc.nextDouble();
		nxtLn=sc.nextLine();
		totVendas=sc.nextDouble();
		
		comissao=totVendas*0.15;
		total=salario+comissao;
		
		System.out.printf("TOTAL = R$ %.2f\n",total);
		
		sc.close();
	}
}
