package Aula_02;
import java.util.Scanner;

public class ContaPopanca extends Conta {
	
	@Override
	
	public static void main(String[] args) {
		
		System.out.println("### Extrato da Conta ###");
		System.out.println("R# - " + super.getSaldo());

	}

}
