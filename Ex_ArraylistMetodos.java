package Estrutura_Arraylist;

import java.util.ArrayList;

public class Ex_ArraylistMetodos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10); //add elementos ao Arraylist
		numeros.add(20);
		
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		
		numeros.set(1, 25); //muda a posição 1
		System.out.println(numeros.get(1)); //o get captura o valor e o Sysout mostra na tela
		
		numeros.remove(0);
		System.out.println(numeros.get(0));
		
		System.out.println(numeros.size()); 
	}

}
