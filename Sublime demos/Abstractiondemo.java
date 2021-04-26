class Abstractiondemo{
	public static void main (String args []){
A obj1 = new A();    obj1.dis1();
B obj2 = new B();    obj2.dis1();             obj2.dis2();
//B obj3 = new A();     //creating super class object sub class reference not possible
A obj4 = new B();    //sub class object and super class reference possible
                   // We can only call those methods which belong to super class or overrided method 
           //Super class may be Normal class or abstract class or interface . 
obj4.dis1();
//obj4.dis2(); // super class cant call object class 	
	}
}
class A {
	void dis1(){
System.out.println("A class method ");
	}
	}
	class B extends A {  // Sub class because its extending Super class 
	void dis1(){
	System.out.println("A class override method");
	}
	void dis2(){
	System.out.println("B class method ");
	}
	}