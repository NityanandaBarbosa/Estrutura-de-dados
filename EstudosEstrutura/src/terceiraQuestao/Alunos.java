package terceiraQuestao;
public class Alunos {
	String nome;
	int matricula;
	String endereco;
	Alunos proxAluno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Alunos getProxAluno() {
		return proxAluno;
	}
	public void setProxAluno(Alunos proxAluno) {
		this.proxAluno = proxAluno;
	}
	
	
}
