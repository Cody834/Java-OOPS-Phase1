public class APP4 {
public static void main(String args) {
	Vehicle veh1=new Vehicle();
	Vehicle veh2=new Vehicle();
	Vehicle veh3=new Vehicle();
	veh1.Vehicle="Bmw M235i";
	veh1.Type="Sports car";
	veh1.Year="2016";
	veh1.price="650 000.0";
	veh1.display();
	veh2.Vehicle="Bmw x5M";
	veh2.Type="Suv";
	veh2.Year="2019";
	veh2.price="450 000.00";
	veh2.display();
	veh3.Vehicle="Bmw M6";
	veh3.Type="Family/Sports";
	veh3.Year="2019";
	veh3.price="750 000.00";
	veh3.display();
}
}
class Vehicle {
	String Vehicle;
	String Type;
	String price;
	String Year;
	void display() {
		System.out.println("Vehicle -"+Vehicle);
		System.out.println("Type -"+Type);
		System.out.println("Year -"+Year);
		System.out.println("Price R"+price);
		
		
	}
}