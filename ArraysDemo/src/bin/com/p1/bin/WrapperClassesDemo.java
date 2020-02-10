package bin.com.p1.bin;

import java.util.ArrayList;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		int i=20;
		Integer i1=new Integer(5);//Boxing
		Integer i2=i1;//Autoboxing
		int j=i2.intValue();//Unboxing
		int k=i2;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(j);
		System.out.println(k);
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(5);
		arrayList.add(51);
		System.out.println(arrayList);
		int a=arrayList.get(0);
		System.out.println(a);

	}

}
