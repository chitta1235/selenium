package selenium6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfArray {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5,9,9,9,5,6};
         
	        //This array has duplicate elements
	        System.out.println( Arrays.toString(numbers) );
	        LinkedHashSet<Integer> linkedHashset= new LinkedHashSet<>(Arrays.asList(numbers));
	        Integer[] numbersWithoutDuplicates = linkedHashset.toArray(new Integer[] {});
	        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
	        

	}

}
