package segundaQuestao;
import java.util.Scanner;

public class segundaQuestao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Item A ! ");
		int num1 = 12;
		int num2 = 222;
		int resultadoSoma = num1 + num2;
		int resultadoSub = num1 - num2;
		System.out.println("Resultado de A+B = " + resultadoSoma);
		System.out.println("Resultado de A-B = " + resultadoSub);
		
		System.out.println("Item B !");
		long num11 = 1555452448;
		long num12 = 2487852;
		System.out.println(num11/num12);
		
		System.out.println("Item C !");
		System.out.println(108%14);
		
		System.out.println("Item D !");
		System.out.println(num1 == num12);
		
		System.out.println("Item E !");
		double num13 = 64.59;
		double num14 = 1.889999;
		
		System.out.println("Item F !");
		System.out.println(num13+num14);
		
		System.out.println("Item G !");
		System.out.println(Math.pow(7, 3));
		
		System.out.println("Item H !");
		System.out.println("Criando vetor ...");
		double[] vetor = new double[8];
		vetor[4] = 15.3;
		
		System.out.println("Item I !");
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente ");
		cliente.setNome(scan.nextLine());
		System.out.println(cliente.getNome());
		System.out.println("Passe a data de nascimento do mesmo : ");
		cliente.setDataAniver(scan.nextLine());
		System.out.println(cliente.getDataAniver());
		System.out.println("Passe o salario do mesmo : ");
		cliente.setSalario(scan.nextDouble());
		System.out.println(cliente.getSalario());
		
		System.out.println("Item J !");
		Enum semana = Enum.QUINTA;
		System.out.println(semana);
		System.out.println(semana.ordinal());
		
	}
}
