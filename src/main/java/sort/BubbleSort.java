package sort;

public class BubbleSort {

	public BubbleSort() {}

	public void sort(int vet[]) {

		if (vet != null) {

			int tamVet = vet.length;

			int aux = 0;

			for (int i = 0; i < tamVet; i++) {

				for (int j = 0; j < tamVet - 1; j++) {

					if (vet[j] > vet[j + 1]) {
						aux = vet[j];
						vet[j] = vet[j + 1];
						vet[j + 1] = aux;

					}
				}
			}

		}

	}

}
