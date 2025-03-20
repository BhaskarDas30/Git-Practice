// Program to find the Maximum Element and the Minimum Element in an Array
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
	public int FindMin(int arr[],int size) {
		int min=arr[0];
		for(int i=1;i<size;i++) {
			if(arr[i]<size) {
				min=arr[i];
			}
		}
		return min;
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
		Program ob=new Program();
		System.out.println("Max Element - " + FindMax(arr, length));
		System.out.println("Min Element - " + ob.FindMin(arr, length));
		sc.close();
	}
}