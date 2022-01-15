import java.util.Scanner;

public class SequenciaPum{//exercicio 1142 URI
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1, j=1;j<=n;i+=4,j++){
			System.out.println(i+" "+(i+1)+" "+(i+2)+" PUM");
		}
		
		sc.close();
	}
}
