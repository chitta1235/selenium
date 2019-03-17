package selenium6;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using iterative method
		
		String str="Binay";
		char[]strArray=str.toCharArray();
		for(int i=strArray.length-1;i>=0;i--){
			System.out.print(strArray[i]);
		}
		
		

	}

}
