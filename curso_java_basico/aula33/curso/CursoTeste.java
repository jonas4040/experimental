import java.util.List;
import java.util.ArrayList;

public class CursoTeste{
	public static void main(String[] args){
		Curso logistica =  new Curso("Logistica","12h-15h");
		
		List<Aluno> alunos = new ArrayList<>();
		
		int[] notasJulia = {5,7,9,10};
		alunos.add(new Aluno("Julia",133211211,notasJulia));
		logistica.setAlunos(alunos);		
		
		Professor carlos = new Professor("Carlos","jotacarlos@emial.com","Armazens");
		logistica.setProfessor(carlos);
		
		System.out.println(logistica);
		System.out.println(logistica.getProfessor());
		System.out.println(logistica.getAlunos());
	}
}
