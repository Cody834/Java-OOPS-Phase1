class demo112{
public static void main (String args[]){

}
}
final class bike {
final void speed ();	
}
final class Honda extends bike {
	void color(){
	System.out.println("Black");
	}
}
class Pulsar extends bike {
	@Override
	void speed (){
	System.out.println("80Km/Hr");
	}
	void color (){
	System.out.println("Red");
	}
}