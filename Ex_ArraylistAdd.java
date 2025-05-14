package Estrutura_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_ArraylistAdd{

	public static void main(String[] args) {
		String[] disciplinas = { "matematica", "filosofia", "historia", "fisica" }; //lista antiga que queremos add mais
		
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas)); //criando uma nova lista em Arraylist
		novaLista.add("geografia");
		novaLista.add("lingua portuguesa");

		for (String i : novaLista) {  //FOR EACH usado para a Arraylist e o i não é indice é quem pega o valor
			System.out.println("Disciplina: " + i); //mostra até o fim da lista independente do tamanho
		}

	}

}
