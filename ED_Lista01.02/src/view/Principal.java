package view;

import controller.RecursivaVetor;

public class Principal {

	public static void main(String[] args) {
		
		// Instanciando os métodos da classe RecursivaVetor
		RecursivaVetor metodo = new RecursivaVetor();
		
		// Definindo o vetor 
		int menor, tamanho, vetor[] = {100, 3, -7, 80, 6, 15, 71, 99, 21, 200};

		tamanho = vetor.length;
		
		// A função recursiva recebe um vetor, o tamnho deste vetor e o valor da última posição
		menor = metodo.MenorValor(vetor, tamanho, vetor[tamanho-1]);
		
		System.out.print("O menor valor deste vetor é: "+menor);

	}

}
