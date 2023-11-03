package sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

	private MergeSort mergeSort;
	private int vet[];
	
	@BeforeEach
	public void setUp() {
		mergeSort = new MergeSort();
		
		vet = new int[]{5,4,2,1,8,3,7,10,9,15,14,24,100,44};

	}
	
	@Test
	public void sortTest() {
		
		System.out.println("*MergeSort*");
		
		System.out.print("vet: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
		
		mergeSort.sort(vet);
		
		System.out.print("vet sort: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
	}


}
