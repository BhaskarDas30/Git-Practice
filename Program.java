import java.util.*;
public class Program {
	public static void main(String args[]) {
		int a=10,b=20;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("------------------");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}