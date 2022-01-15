import java.util.Scanner;

public class Lanche{//exercicio 1038
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int codigo=sc.nextInt();
		int qtd=sc.nextInt();//quantidade
		double valor=0,total=0;
		
		switch(codigo){
			case 1:
				valor=4.00;
				break;
			case 2:
				valor=4.50;
				break;
			case 3:
				valor=5.00;
				break;
			case 4:
				valor=2.00;
				break;
			case 5:
				valor=1.50;
				break;
		}
		
		total=valor*qtd;
		System.out.printf("Total: R$ %.2f\n",total);
		
		sc.close();
	}
}
