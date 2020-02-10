package p1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		int i=1;
		double total=0;
		System.out.println("Enter inputs");
		Scanner sc=new Scanner(System.in);
		while(i==1)
		{
			double number=sc.nextDouble();
			char opt='+';
			//char opt=(char)sc.next().charAt(0);
			switch(opt)
			{
			case '+':
			{
				total=total+number;
				break;
			}
			case '-':
			{
				total=total-number;
				break;
			}
			case '=':
				i=0;
			
				
			}
		}
System.out.println(total);
	}

}
