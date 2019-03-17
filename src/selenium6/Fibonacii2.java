package selenium6;

import java.util.Scanner;

class chitta{
	int fibo(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}
public class Fibonacii2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fibonacii Term:");
		int n=sc.nextInt();
		System.out.println("fibonacii series is:\n");
		chitta c=new chitta();
		for(int i=0;i<n;i++){
			System.out.print(""+c.fibo(i));
		}

	}

}
