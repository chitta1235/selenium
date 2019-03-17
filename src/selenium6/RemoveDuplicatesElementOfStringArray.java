package selenium6;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementOfStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s={"java","hibernet","j2ee","java"};
		System.out.println(Arrays.toString(s));
		LinkedHashSet<String> linkedHashset=new LinkedHashSet<>(Arrays.asList(s));
		String[] numbersWithoutDuplicates=linkedHashset.toArray(new String[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

	}

}
