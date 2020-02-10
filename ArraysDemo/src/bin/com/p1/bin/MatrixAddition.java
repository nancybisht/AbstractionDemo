package bin.com.p1.bin;

public class MatrixAddition {

	public static void main(String[] args) {
	int mat1[][]= {{4,3,2},{5,6,7},{6,9,8}};
	int mat2[][]= {{4,4,2},{7,1,0},{6,9,8}};
	int mat3[][]=new int[3][3];
	for(int i=0;i<mat1.length;i++)
		for(int j=0;j<mat1.length;j++)
		{
					mat3[i][j]=mat1[i][j]+mat2[i][j];
			
		}
	System.out.println("Matrix addition is:");
	for(int i=0;i<mat3.length;i++) {
		System.out.println();
		for(int j=0;j<mat3.length;j++)
		System.out.print(mat3[i][j]);
	}}

}
