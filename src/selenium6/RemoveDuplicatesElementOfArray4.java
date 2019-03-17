package selenium6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers=new Integer[]{1,2,3,3,3,4,4,5,5,6,6,7,7};
		System.out.println(Arrays.toString(numbers));
		LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>(Arrays.asList(numbers));
		Integer[] numbersWithoutDuplicates=linkedHashSet.toArray(new Integer[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

	}

}
