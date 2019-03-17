package selenium6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers=new Integer[]{1,1,2,2,3,3,4,4};
		System.out.println(Arrays.toString(numbers));
		LinkedHashSet<Integer> linkedHashset=new LinkedHashSet<>(Arrays.asList(numbers));
		Integer[] numbersWithoutDuplicates=linkedHashset.toArray(new Integer[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

	

}
}
