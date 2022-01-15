import java.util.Scanner;

public class AlturaeSexo{//exercicio 8 vetores
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int qtdHomens=0,qtdMulheres=0;
		double maiorAlt,menorAlt, soma=0, medAlt;
		
		int N=sc.nextInt();
		double[] altura= new double[N];
		char[] sexo=new char[N];
		
		for(int i=0;i<N;i++){
			altura[i]=sc.nextDouble();
			sexo[i]=sc.next().charAt(0);
			
			if(sexo[i]=='F'){
				qtdMulheres++;
				soma+=altura[i];
			}
			else if(sexo[i]=='M')
				qtdHomens++;			
		}
		
		maiorAlt=altura[0];
		menorAlt=altura[1];
		for(int j=0;j<N-1;j++){
			if(maiorAlt > altura[j+1]){//reformular com < && > e colocar o que esta no else
				//menorAlt=altura[j+1];
			}else{
				maiorAlt=altura[j+1];
			}
			
			if(menorAlt < altura[j]){
				
			}else{
				menorAlt=altura[j];
			}
		}
		medAlt=(double)soma/qtdMulheres;//media de altura das mulheres
		
		System.out.println("Menor altura = "+menorAlt);
		System.out.println("Maior altura = "+maiorAlt);		
		System.out.printf("Media das alturas das mulheres = %.2f\n",medAlt);
		System.out.println("Numero de homens = "+qtdHomens);
		
		sc.close();
	}
}
