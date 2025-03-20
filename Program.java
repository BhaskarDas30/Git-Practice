// Program to find the Maximum Element in an Array
import java.util.*;
public class Program {
	public static int FindMax(int arr[], int size) {
		int max=0;
		for(int i=0;i<size;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return 0;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the Array Elements :- ");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Max Element Present in the Array - "+FindMax(arr, length));
		sc.close();
	}
}