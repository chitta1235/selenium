package selenium6;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1={"java","php","hibenet","corejava"};
		String[] s2={"java1","php5","hibenet7","corejava3"};
		String[] s3={"java","php","hibenet","corejava"};
		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.equals(s1, s3));
		System.out.println(Arrays.equals(s2, s3));

	}

}
