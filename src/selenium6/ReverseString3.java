package selenium6;

public class ReverseString3 {

	public static void main(String[] args) {
		String str1="this is input string";
		System.out.println(str1);
		System.out.println(str1.length());
		String str=" ";
		str+=str1;
		String res="";
		String realres="";
		for(int i=str.length()-1;i>=0;i--){
			if(Character.isWhitespace(str.charAt(i))||i==0){
				for(int j=res.length()-1;j>=0;j--){
					realres+=res.charAt(j);
				}
				realres+=" ";
				res="";
			}
			else{
				res+=str.charAt(i);
			}
			System.out.println(realres);
		}

	}

}
