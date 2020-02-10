package bin.com.p1.bin;
import java.util.Scanner;
public class LargestElementDemo {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("array elements are:");
		for(int i:arr)
			System.out.println(i);
		int largest=arr[0];
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]>largest)
					largest=arr[j];
			}
	System.out.println("Largest Element is:"+largest);
	}

}
