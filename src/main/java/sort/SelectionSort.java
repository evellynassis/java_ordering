package sort;

public class SelectionSort {

	public SelectionSort() {}

	public void sort(int vet[]) {

		if (vet != null) {

			int tamVet = vet.length;

			int eleito = 0;
			int menor = 0;
			int pos = 0;

			for (int i = 0; i < tamVet - 1; i++) {
				eleito = vet[i];
				menor = vet[i + 1];
				pos = i + 1;

				for (int j = i + 1; j < tamVet; j++) {
					if (vet[j] < menor) {
						menor = vet[j];
						pos = j;
					}
				}

				if (menor < eleito) {
					vet[i] = vet[pos];
					vet[pos] = eleito;
				}
			}

		}

	}

}
