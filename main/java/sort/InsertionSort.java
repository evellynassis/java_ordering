package sort;

public class InsertionSort {

	public InsertionSort() {}

	public void sort(int vet[]) {

		if (vet != null) {

			int tamVet = vet.length;

			int eleito = 0;
			int j = 0;

			for (int i = 0; i < tamVet; i++) {

				eleito = vet[i];
				j = i - 1;

				while (j >= 0 && vet[j] > eleito) {
					vet[j + 1] = vet[j];
					j = j - 1;
				}

				vet[j + 1] = eleito;

			}

		}
	}

}
