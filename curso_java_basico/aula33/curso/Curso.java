import java.util.List;

public class Curso{
	private String nome;
	private String horario;
	private Professor professor;
	private List<Aluno> alunos;
	
	public Curso(){}
	
	public Curso(String nome, String horario){
		this.nome=nome;
		this.horario=horario;
	}
	
	//getters & setters
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getHorario(){
		return this.horario;
	}
	
	public void setHorario(String horario){
		this.horario=horario;
	}
	
	public Professor getProfessor(){
		return this.professor;
	}
	
	public void setProfessor(Professor professor){
		this.professor=professor;
	}
	
	public List<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void setAlunos(List<Aluno> alunos){
		this.alunos=alunos;
	}
	
	@Override
	public String toString(){
		String str = nome+" , "+horario+"\n";
		return str;
	}
}
