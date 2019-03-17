package selenium6;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesElementOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namelist=new ArrayList<String>(Arrays.asList("alex","brain","charles"));
		System.out.println(namelist);
		namelist.remove(1);
		System.out.println(namelist);

	}

}
