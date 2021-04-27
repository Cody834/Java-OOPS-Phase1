class Polymdemo2 {
	public static void main (String args[]){
	Pulsar pu = new Pulsar ();
	SuperPulsar sp = new SuperPulsar();
	sp.speed();
	}
}
class Bike {
	void speed (){
	System.out.println("60Km/Hr");
	}
}
class Pulsar extends Bike {
	@Override
	void speed (){
		super.speed();
	System.out.println("90Km/Hr");
	}
}
class SuperPulsar extends Pulsar {
	@Override
void speed(){
	super.speed();
System.out.println("150km/hr");
}
	
}