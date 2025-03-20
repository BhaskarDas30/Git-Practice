// Program to find the Maximum Element in an Array
import java.util.*;
public class Program {
	public static int FindMax(int arr[], int size) {
		int max=0;
		for(int i=0;i<size;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println(FindMax(arr, length));
		sc.close();
	}
}