import java.util.Scanner;

public class GastoCombustivel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t,velMedia,d;//tempo em horas, velocidade media e distancia
		double qtdLitros;
		
		t=sc.nextInt();
		velMedia=sc.nextInt();
				
		d=t*velMedia;
		qtdLitros=(double) d/12;
		
		System.out.printf("%.3f\n",qtdLitros);
		
		sc.close();
	}
}
