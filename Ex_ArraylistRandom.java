package Estrutura_Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ex_ArraylistRandom {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random(); //aqui o random substitui o SACANNER - construção de objeto

		for (int i = 0; i < 5; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		for (int numero : numeros) {
			System.out.println(numero);
		}
	}
}
