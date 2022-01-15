import java.util.Scanner;

public class GirarSoldados{//exercicio 7 matrizes
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int M=sc.nextInt();
		int N=sc.nextInt();
		int[][] soldados=new int[M][N];
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				soldados[i][j]=sc.nextInt();
			}
		}
		
		int nFila=sc.nextInt();//linha escolhida
		nFila=nFila-1;//considerando a primeira linha como zero
		int aux= soldados[nFila][N-1];
		for(int j=N-1;j>=0;j--){
			if(j==0){
				soldados[nFila][0]=aux;
				System.out.println("Primeiro da "+(nFila+1)+" : "+soldados[nFila][0]);
			}else if(j>0){
				//int aux2=soldados[nFila][j];//guarda em auxiliar2
				soldados[nFila][j]=soldados[nFila][j-1];//e o novo valor da coluna j = j-1
			}
		}
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print(soldados[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
