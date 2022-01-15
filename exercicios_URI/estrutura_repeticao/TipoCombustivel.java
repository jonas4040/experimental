import java.util.Scanner;

public class TipoCombustivel{//exercicio 1134 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int qtdAlc, qtdGas, qtdDiesel;
		qtdAlc= qtdGas= qtdDiesel=0;
		int combustivel=sc.nextInt();
		
		while(combustivel!=4){
			switch(combustivel){
				case 1:
					qtdAlc++;
					break;
				case 2:
					qtdGas++;
					break;
				case 3:
					qtdDiesel++;
					break;
				default:
					break;
			}
			combustivel=sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\nGasolina: %d\n	Diesel: %d\n",qtdAlc,qtdGas,qtdDiesel);
		
		sc.close();
	}
}
