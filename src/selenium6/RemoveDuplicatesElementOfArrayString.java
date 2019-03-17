package selenium6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfArrayString {

	public static void main(String[] args) {
		String[] numbers={"java","j2ee","spring","hibernates","java","hibernates"};
		System.out.println(Arrays.toString(numbers));
		LinkedHashSet<String> linkedHashset=new LinkedHashSet<>(Arrays.asList(numbers));
		String[] numbersWithoutDuplicates= linkedHashset.toArray(new String[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

	}

}
