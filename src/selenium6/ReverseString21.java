package selenium6;

public class ReverseString21 {

	public static void main(String[] args) {
		// using iterative method
		String str="chitta";
		char[] strArray=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--){
			System.out.print(strArray[i]);
			
		}
		

	}

}
