package p1;

public class Test implements Showable {

	public static void main(String[] args) {
	Printable s=new Test();
	//s.a=8;//As it is final so not allowed
	System.out.println(Printable.a);
	}

	@Override
	public int disp() {
		System.out.println("Hello");
		return 0;
	}

	@Override
	public void show() {
		System.out.println("Hello show");
		
	}

}
