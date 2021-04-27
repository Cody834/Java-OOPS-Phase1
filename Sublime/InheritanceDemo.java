class InhertianceDemo{
	public static void main(String args[]) {
		Oldclass obj1=new Oldclass();
		obj1.dis1();
		B obj2= new B();
		obj2.dis2();
		obj2.dis1();
		
	}
}
class B {
	void dis2() {
		System.out.println("B class method");
	}
}
public class Oldclass {
	void dis1() {
		System.out.println("A class method");
	}

}