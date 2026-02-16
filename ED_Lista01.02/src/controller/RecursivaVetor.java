package controller;

public class RecursivaVetor {

	public RecursivaVetor() {
		super();
	}
	
	// A função recursiva recebe um vetor, o tamnho deste vetor e o valor da última posição
	public int MenorValor(int[] vet, int tamanho, int valor) {
		
		// O tamanho do vetor indica quantas posições ele possui
		// O índice do vetor inicia em zero, portanto o índice é sempre o tamanho-1
		
		if(vet[tamanho-1]<valor) {
			valor=vet[tamanho-1];
		}
		
		// A condição de parada será quando a recursiva chegar no índice=0 (tamanho-1==0)
		
		if(tamanho-1==0) {
			
			return valor;
		}
		
		return MenorValor(vet, tamanho-1, valor);
	}

}
