package selenium6;

public class BubbleSort4 {

	public static void main(String[] args) {
		int intArray[]={9,8,7,6,5,4,3,2,1};
		System.out.print("before sorting--->");
		for(int i:intArray){
			System.out.print(i);
		}
		bubblesort(intArray);
		System.out.print("after sorting--->");
		for(int i:intArray){
			System.out.print(i);
		}
		

	}

	private static void bubblesort(int[] intArray) {
	int temp=0;
	for(int i=0;i<intArray.length;i++){
		for(int j=1;j<intArray.length-i;j++){
			if(intArray[j-1]>intArray[j]){
				temp=intArray[j-1];
				intArray[j-1]=intArray[j];
				intArray[j]=temp;
			}
		}
	}
		
	}

}
