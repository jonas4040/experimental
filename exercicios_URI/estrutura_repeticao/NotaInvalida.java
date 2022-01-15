import java.util.Scanner;

public class NotaInvalida{//exercicio 1117 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int qtdInvalidas=0, i=0;// quantidade de notas invalidas e contador
		double media=0, soma=0;
		double nota=0;	
		
		while(i<2){
			nota = sc.nextDouble();
			if(nota>0 && nota<=10){
				soma+=nota;
				i++;
			}else{
				qtdInvalidas++;
				System.out.println("nota invalida");
			}
		}
		media=(double) soma/i;
		System.out.printf("media = %.2f\n",media);
		
		sc.close();
	}
}
