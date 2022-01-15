import java.util.Scanner;

public class IdadeMeses{//exercicio URI 1020 Modificado
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int idade, mes, dias;
		System.out.print("Quantos anos voce tem ");
		idade= sc.nextInt();
		mes=idade/12;//quantos meses
		dias=idade%12;
				
		System.out.println("Voce tem "+idade+" anos, "+mes+" meses e "+dias+" dias.");
		
		sc.close();
	}
}
