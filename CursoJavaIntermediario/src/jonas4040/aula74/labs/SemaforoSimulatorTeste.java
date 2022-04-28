package jonas4040.aula74.labs;

public class SemaforoSimulatorTeste {

	public static void main(String[] args) {
		SemaforoSimulator smf = new SemaforoSimulator();
		while (true) {
			try {
				System.out.println("Verde");
				Thread.sleep(smf.TEMPO_VD);

				System.out.println("Amarillo");
				Thread.sleep(smf.TEMPO_AMR);

				System.out.println("Rojo");
				Thread.sleep(smf.TEMPO_VR);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
