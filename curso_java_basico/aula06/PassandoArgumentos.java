public class PassandoArgumentos{
	public static void main(String[] args){
		
		for(int i=0;i<args.length;i++){
			switch(args[i]){
				case "-h":
					System.out.println("AJUDA ");
					break;
				case "-v":
					System.out.println("VERSAO 1.0.3.x");
					break;
				default:
					System.out.println(args[i]+" Nao eh um comando valido.");
					break;
			}
		}
		
		//System.out.println("Voce digitou "+args[0]);
	}
}
