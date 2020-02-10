
	class MyObjectClass {
	int id=1;	//Instance Variable
	String name="welcome";   //Instance Variable
	static String clgName="TMU";
	public static void main(String[] args) {
	int id=2;	//Local Variable
	MyObjectClass ob=new MyObjectClass();
	ob.id=4;
	System.out.println("Object Id"+ob.id);
	System.out.println("Object Name"+ob.name);
	System.out.println("Local Id"+id);
	System.out.println("static Variable"+clgName); 
	

	

}
