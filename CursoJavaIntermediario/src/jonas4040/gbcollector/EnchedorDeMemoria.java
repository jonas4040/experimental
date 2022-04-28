package jonas4040.gbcollector;

public class EnchedorDeMemoria {
	
	static void getUsedMemory() {
		final int MB = 1024*1024;
		Runtime rt= Runtime.getRuntime();
		System.out.println("Quantidade de memoria --> aprox ~~"+
							(rt.totalMemory()-rt.freeMemory())/MB
							+" MB"
							);
	}

	public static void main(String[] args) {
		ContaBancaria[] contas = new ContaBancaria[(int)Math.pow(10,8)];
		ContaBancaria ctBancaria;
		
		for(int i=0;i<contas.length;i++) {
			ctBancaria = new ContaBancaria("Pessoa "+i, 12345678+i, +1220000.9900887709*i);
		}
		
		System.out.println("Contas criadas");
		getUsedMemory();
		
		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		ctBancaria= null;//tira da memoria a referencia de objetos
		System.out.println("Contas removidas da memoria");
		getUsedMemory();
	}

}
