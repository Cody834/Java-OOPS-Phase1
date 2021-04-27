class APP{
public static void main(String args[]){
	ABC obj1=new ABC();
	obj1.add();
	obj1.display();
	ABC obj2=new ABC();
	obj2.add();
	obj2.display();
	ABC obj3=new ABC(100,200);
	obj3.add();
	obj3.display();
	ABC obj4=new ABC(10,20);
	obj4.add();
    obj4.display();
    ABC obj5=new ABC();
    obj5.setValue(1,2);
    obj5.setValue(4,5);
    obj5.add();
    obj5.setValue(7,8);
    obj5.display();
}	
}
class ABC{
	int a,b,sum;
	ABC(){
		a=10;
		b=20;

	}
	ABC(int x , int y){
a=x;
b=y;
	}
	void setValue(int x , int y) {
		a=x;
		b=y;
	}
	void add(){
	sum = a+b;

	}
	void display(){
	System.out.println("Sum is "+sum);
	}
}