import java.util.Scanner;

public class CalculoTotal{//exercicio 1010 -- OBS:mudar para Main
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int codPeca1,codPeca2,qtd1,qtd2;//codigo das pecas e quantidade de pecas
		double valor1,valor2,soma;
		String a;//string para quebrar a linha
		
		codPeca1=sc.nextInt();
		qtd1=sc.nextInt();
		valor1=sc.nextDouble();
		a=sc.nextLine();
		
		codPeca2=sc.nextInt();
		qtd2=sc.nextInt();
		valor2=sc.nextDouble();
		a=sc.nextLine();
		
		soma=(qtd1*valor1)+(qtd2*valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",soma);
		
		sc.close();
	}
}
