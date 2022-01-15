import java.util.Scanner;

public class TempoJogo{//exercicio 1046
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int horaInicial,horaFinal,proximoDia,duracao;
		horaInicial=sc.nextInt();
		horaFinal=sc.nextInt();
		
		proximoDia=horaFinal+24;//no dia seguinte
		if(proximoDia>24 && horaInicial>horaFinal){
			duracao=proximoDia-horaInicial;
		}else if(horaInicial==horaFinal){
			duracao=24;
		}else{//se horaInicial<horaFinal
			duracao=horaFinal-horaInicial;
		}
		System.out.println("O JOGO DUROU "+duracao+" HORA(S)");	
		sc.close();
	}
}
