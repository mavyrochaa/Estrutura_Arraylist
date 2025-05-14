package Estrutura_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Dsf_ArraylistPositivo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um número: " + (i+1));
			int numero = scanner.nextInt();
			
			if (numero >0 ) {
				System.out.println("numero positivo: " + numero);
			}
		}
	}
}
