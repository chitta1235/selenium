package selenium6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name= Arrays.asList("aelx","charels","binay","muduli");
		name.sort(Comparator.comparing(String::toString));
		System.out.println(name);
		name.sort(Comparator.comparing(String::toString).reversed());
		System.out.println(name);

	}

}
