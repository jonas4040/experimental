import java.util.Scanner;

public class MediaPonderada{// exercicio 1006
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String quebraLinha;// string para quebra de linha
		double A,B,C,mediaPond;//as 3 notas e a media ponderada
		
		A=sc.nextDouble();
		quebraLinha=sc.nextLine();
		B=sc.nextDouble();
		quebraLinha=sc.nextLine();
		C=sc.nextDouble();
		quebraLinha=sc.nextLine();
		
		mediaPond=((A*2)+(B*3)+(C*5))/10;
		System.out.printf("MEDIA = %.1f\n",mediaPond);
		
		sc.close();
	}
}
