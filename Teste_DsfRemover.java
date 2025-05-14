package Estrutura_Arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Teste_DsfRemover {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		Random aleatorio = new Random();

		for (int i = 0; i < 10; i++) {
			int lista = aleatorio.nextInt(10);
			numeros.add(lista);
		}
		//Mostra após o carregamento
		System.out.println(numeros);
		
		//removendo o elemento 4
		numeros.remove(4);
		
		System.out.println(numeros);
		}
	}
