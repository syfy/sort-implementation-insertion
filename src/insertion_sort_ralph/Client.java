package insertion_sort_ralph;

public class Client {
	static int arrs[] = { 1, 7, 3, 4, 6, 2 };

	public static void main(String[] args) {
		for (int x = 0; x < arrs.length; x++) {
			int current = arrs[x];
			printArr();

			int offsetCompare = x - 1;
			while (offsetCompare > 0 && (current < arrs[offsetCompare])) { //while is positive offset and current element less than compared elemenhts
				arrs[offsetCompare+1] = arrs[offsetCompare]; // transfer  to right side
				offsetCompare--;
	
			}
	
			arrs[offsetCompare + 1] = current; //move == element

		}

		printArr();
	}
public static void printArr (){
	System.out.println();
	for (int tmp : arrs) {
		System.out.print(tmp + " ");
	}
}
	
}
