class Manager extends Employee {
	private int numberOfEmp;
	public void setManager(int numberOfEmp) {
		this.numberOfEmp=numberOfEmp;
	}
	public void displayManager() {
		System.out.println("Number of Employee"+numberOfEmp);
	}
}
public void displayEmployee() {
	System.out.println("id is " +this.id);
	System.out.println("Name is "+ this.name);
	System.out.println("Salary is"+ this.salary);
	
}

public class EmployeeAPP2 {
private int id;
private String name ;
private float salary;
public void setEmployee(int id , String name , float salary ) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
}