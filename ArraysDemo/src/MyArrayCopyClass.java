import java.util.Arrays;
public class MyArrayCopyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom= {'a','b','c','f','e','n'};
		char[] copyTo= Arrays.copyOfRange(copyFrom, 0, 3);
		System.out.println(copyTo);

	}

}
