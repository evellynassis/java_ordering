package sort;

public class MergeSort {

	public MergeSort() {}

	public void sort(int vet[]) {

		if (vet != null) {

			int tamVet = vet.length;

			merge(vet,0 , tamVet-1);

		}
	}

	private void merge(int vet[], int inicio, int fim) {
		int meio;
		int tamVet = vet.length;

		if (inicio < fim) {
			meio = (inicio + fim) / 2;
			merge(vet, inicio, meio);
			merge(vet, meio + 1, fim);
			intercalada(vet, tamVet, inicio, fim, meio);
		}

	}

	private void intercalada(int vet[], int tamVet, int inicio, int fim, int meio) {
		int posLivre, inicioVetor1, inicioVetor2, i;

		int aux[] = new int[tamVet];
		
		inicioVetor1 = inicio;
		inicioVetor2 = meio + 1;
		posLivre = inicio;
		
		while(inicioVetor1 <= meio && inicioVetor2 <= fim) {
			if(vet[inicioVetor1] <= vet[inicioVetor2]) {
				aux[posLivre] = vet[inicioVetor1];
				inicioVetor1 = inicioVetor1 + 1;
			} else {
				aux[posLivre] = vet[inicioVetor2];
				inicioVetor2 = inicioVetor2 + 1;
			}
			posLivre = posLivre+1;
		}
		
		for (i = inicioVetor1; i <= meio; i++) {
			aux[posLivre] = vet[i];
			posLivre = posLivre+1;
		}
		
		for (i = inicioVetor2; i <= fim; i++) {
			aux[posLivre] = vet[i];
			posLivre = posLivre+1;
		}
		
		for (i = inicio; i <= fim; i++) {
			vet[i] = aux[i];
		}
	}

}
