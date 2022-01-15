import java.util.Scanner;

public class ElemRep{//VOLTAR NESSE exercicio 1 complementar
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] S= new int[10];
		int[] X= new int[10];
		int[] R= new int[5];
		
		for(int i=0;i<5;i++)
			R[i]=sc.nextInt();
			
		for(int j=0;j<5;j++)
			S[j]=sc.nextInt();
			
		for(int r=0;r<5;r++){
			for(int s=0;s<10;s++){
				//System.out.println("Valor de r: "+r+",Valor de s: "+s);
				if(R[r]==S[s])
					X[s]=S[s];
			}
		}
		
		for(int k=0;k<10;k++)
			System.out.print("|"+X[k]+"|");
		
		sc.close();
	}
}
