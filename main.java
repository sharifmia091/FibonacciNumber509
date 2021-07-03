import java.util.Scanner;

public class FibonacciNumber509 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input the number: ");
		int num = input.nextInt();
		fibonacciNumber(num);
				
	}
	
	public static void fibonacciNumber(int num) {
		if (num==0) {
			System.out.printf("\nThe fibonacci number is %d ", 0);
		}
		
		
		else {
			long[] arr = new long[num+1];
			arr[0]=0;
			arr[1]=1;
			
			for (int i=2;i<arr.length;i++) {
				arr[i]=arr[i-2]+arr[i-1];
			}
			System.out.printf("\nThe fibonacci number is %d ", arr[num]);
		}
	}

}
