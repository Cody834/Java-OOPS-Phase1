class Polymorphismdemo123(2){
	public static void main (String args[]){
	honda hh=new honda();      hh.speed();  hh.color();

	pulsar pu=new pulsar();   pu.speed();   pu.color();

Tvs t = new Tvs();   t.speed();  t.color();
}
}
class bike {
void speed (){
	System.out.println("60km/hr");
}
	}
	class honda extends bike {
	void color(){
	System.out.println("black");
	}
	void speed(){
System.out.println("80Km/hr");
	}
}
	class pulsar extends bike {
	@Override
	void speed (){
	System.out.println("90Km/hr");
	}
	void color(){
	System.out.println("Red");
	}
	}
	class Tvs extends bike {
	super.speed();    //Merge both class code
	void speed (){
	System.out.println("20Km/hr");
	}
	void color(){
	System.out.println("White");
	}
