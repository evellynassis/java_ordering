package sort;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickSortTest {

	private QuickSort quickSort;
	private int vet[];
	
	@BeforeEach
	public void setUp() {
		quickSort = new QuickSort();
		
		vet = new int[]{5,4,2,1,8,3,7,10,9,15,14,24,100,44};

	}

	@Test
	public void sortTest() {
		
		System.out.println("*QuickSort*");
		
		System.out.print("vet: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
		
		quickSort.sort(vet);
		
		System.out.print("vet sort: ");

		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
		
		System.out.println("");
	}


}
