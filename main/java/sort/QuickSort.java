package sort;

public class QuickSort {

	public QuickSort() {}

	public void sort(int vet[]) {

		if (vet != null) {

			int posInicial = 0;
			int posFinal = vet.length-1;

			quicksort(vet, posInicial, posFinal);
		}

	}

	private void troca(int vet[], int i, int j) {
		int aux;
		aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

	private int particao(int vet[], int posi, int posj) {
		int pivo, i, j;
		pivo = (int) vet[(posi + posj) / 2];
		i = posi - 1;
		j = posj + 1;

		while (i < j) {

			do {
				j = j - 1;
			}
			while (vet[j] > pivo);
			
			do {
				i = i + 1;
			} 
			while (vet[i] < pivo);
			if (i < j) 
				troca(vet, i, j);
		}

		return j;

	}

	private int[] quicksort(int vet[], int posi, int posj) {

		int vetOrdenado[] = new int[vet.length];

		int q = 0;
		if (posi < posj) {
			q = particao(vet, posi, posj);
			quicksort(vet, posi, q);
			quicksort(vet, q + 1, posj);
			vetOrdenado[q] = vet[q];
		}

		return vetOrdenado;
	}

}