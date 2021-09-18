package Aula_01;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Raniel");
		
		aluno1.setIdade(31);

		
		System.out.println("Seu nome é: " +aluno1.getNome());
		System.out.println("Sua idade é: " +aluno1.getIdade());
	}

}
