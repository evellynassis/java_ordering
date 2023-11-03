package sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
	
	private InsertionSort insertionSort;
	private int vet[];

	@BeforeEach
	public void setUp() {
		insertionSort = new InsertionSort();
		
		vet = new int[]{5,4,2,1,8,3,7,10,9,15,14,24,100,44};

	}
	
	@Test
	public void sortTest() {
		
		System.out.println("*InsertionSort*");
		
		System.out.print("vet: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
		
		insertionSort.sort(vet);
		
		System.out.print("vet sort: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
	}

}
