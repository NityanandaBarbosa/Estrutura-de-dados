package terceiraQuestao;
import java.util.Scanner;

public class terceiraQuestao {

	public static void main(String[] args) {
		Alunos primeiraMatricula = null;
		Alunos ultimaMatricula = null;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Digite a primeira matricula:");
		int matricula = scan1.nextInt();

		if (matricula > 0) {
			primeiraMatricula = new Alunos();
			primeiraMatricula.setMatricula(matricula);
			System.out.println("Digite o nome do Aluno(a)");
			primeiraMatricula.setNome(scan.nextLine());
			System.out.println("Digite o endereço do Aluno(a)");
			primeiraMatricula.setEndereco(scan.nextLine());
			ultimaMatricula = primeiraMatricula;

			while (matricula > 0) {
				System.out.println("Novo aluno!!");
				System.out.println("Digite a proxima Matricula :");
				matricula = scan1.nextInt();
				if (matricula > 0) {
					Alunos novoAluno = new Alunos();
					novoAluno.setMatricula(matricula);
					System.out.println("Digite o nome do Aluno(a)");
					novoAluno.setNome(scan.nextLine());
					System.out.println("Digite o endereço do Aluno(a)");
					novoAluno.setEndereco(scan.nextLine());
					ultimaMatricula.setProxAluno(novoAluno);
					ultimaMatricula = novoAluno;
				}
			}
			scan.close();


			Alunos aux = primeiraMatricula;
			while (aux != null) {
				System.out.println(aux.getNome());
				System.out.println(aux.getMatricula());
				System.out.println(aux.getEndereco());
				System.out.println();
				aux = aux.proxAluno;
			}

		}

	}

}
