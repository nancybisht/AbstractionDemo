import java.util.Scanner;

public class InsertElementDemo {

	public static void main(String[] args) {
		int arrayD[]= {3,4,5,1,8,9,7};;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the index and Element to insert");
		int ind=sc.nextInt();
		int num=sc.nextInt();
		for(int i=arrayD.length-1;i>ind;i--)
			arrayD[i]=arrayD[i-1];
	
			arrayD[ind]=num;
		for(int i=0;i<arrayD.length;i++)
			System.out.println(arrayD[i]);
	}

}
