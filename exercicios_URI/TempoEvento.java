import java.util.Scanner;

public class TempoEvento{//desafio uri 1061
	public static final int UM_DIA = 24;//24 horas	
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		String ql;//quebra de linha
		int diaInicial,diaFinal,horaInicial,horaFinal,minInicial,minFinal,segInicial,segFinal,dias,horas,minutos,segundos;
		
		System.out.print("Dia ");
		diaInicial=sc.nextInt();
		ql=sc.nextLine();
		horaInicial=sc.nextInt();
		//System.out.print(" : ");
		minInicial=sc.nextInt();
		//System.out.print(" : ");
		segInicial=sc.nextInt();
		ql=sc.nextLine();
		
		System.out.print("Dia ");
		diaFinal=sc.nextInt();
		ql=sc.nextLine();
		horaFinal=sc.nextInt();
		//System.out.print(" : ");
		minFinal=sc.nextInt();
		//System.out.print(" : ");
		segFinal=sc.nextInt();
		ql=sc.nextLine();
		
		dias=Math.abs((diaFinal-diaInicial)-1);
		segundos=Math.abs(segFinal-segInicial);
		minutos=Math.abs(minFinal-minInicial);
		horas=Math.abs(horaFinal-horaInicial);
		horas=UM_DIA-horas;
		
		System.out.printf("%d dia(s)\n%d hora(s)\n%d minuto(s)\n%d segundo(s)\n",dias,horas,minutos,segundos);
		
		sc.close();
	}
}
