package selenium6;

public class BubbleSort1 {

	public static void main(String[] args) {
		int intArray[]={1,2,3,4,5,6,7,8,9};
		System.out.println("before sorting");
		for(int i:intArray){
			System.out.println(i);
		}
		bubblesort(intArray);
		System.out.println("after sorting");
		for(int i:intArray){
			System.out.println(i);
		}

		
	}

	private static void bubblesort(int[] intArray) {
		int temp=0;
		for(int i=0;i<intArray.length;i++){
			for(int j=1;j<intArray.length-i;j++){
				if(intArray[j-1]<intArray[j]){
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
	}

}
