import java.util.Scanner;

public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{3,5,7,1,9},{6,4,3,2,1}};
		int mat[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
		System.out.println();
			for(int j=0;j<5;j++)
				System.out.print(matrix[i][j]);
		}
		System.out.println("Enter elements");
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
				mat[i][j]=sc.nextInt();
			
			
		}
		for(int i=0;i<3;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
				System.out.print(mat[i][j]);
						
		}
	}
	}
