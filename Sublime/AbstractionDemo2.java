class Abstractiondemo2{
	public static void main (String args []){
A obj1 = new B();    
obj1.dis1(); // Sub class object and  interface refernce possible if class implement that interface .
	
	}
}
interface A {
	void dis1();
	}
	
	class B implements A {  // Sub class because its extending Super class 
	public void dis1(){
	System.out.println("A class override method");
	}
	}