import java.util.Scanner;

public class TirarNulos{//exercicio 2 VOLTA NESSE EM complementar
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int aux;
		int[] D= new int[10];
		
		for(int j=0;j<10;j++){
			D[j]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++){
			if(D[i]<=0)
				D[i]=D[i+1];
			if(D[i+1]==D[i])
				D[i+1]=D[i+2];
			System.out.print("|"+D[i]+"|");
		}
		sc.close();
	}
}
