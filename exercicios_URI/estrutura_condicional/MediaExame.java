import java.util.Scanner;

public class MediaExame{//exercicio 1040 uri
	public static final int P1=2,P2=3,P3=4,P4=1;//pesos
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float media=0, notaExame=0;
		
		float nota1=sc.nextFloat();
		float nota2=sc.nextFloat();
		float nota3=sc.nextFloat();
		float nota4=sc.nextFloat();
		
		media=((nota1*P1)+(nota2*P2)+(nota3*P3)+(nota4*P4))/(P1+P2+P3+P4);//dividido pela soma dos pesos
		
		if(media>=7.0)
			System.out.println("Aluno aprovado.");
		else if(media<5.0)
			System.out.println("Aluno reprovado.");
		else if(media>=5.0 && media<=6.9){
			System.out.println("Aluno em exame.");
			notaExame=sc.nextFloat();
			media+=notaExame;
			media/=2;
			
			if(media>5.0)
				System.out.println("Aluno aprovado.");
			else //se media <= 4.9
				System.out.println("Aluno reprovado.");
			
			System.out.printf("Media final: %.1f\n",media);
		}
		sc.close();
	}
}
