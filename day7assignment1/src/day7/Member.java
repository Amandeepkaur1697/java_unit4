package day7;

public class Member {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		
		System.out.println("In one company" + employee.name + " is " + employee.Specialization + " in " + employee.Departement);
		System.out.println("Profile :-");
		System.out.println(employee.name);
		System.out.println(employee.age);
		System.out.println(employee.address);
		System.out.println(employee.phone_Number);
		System.out.println("In another company " + manager.name + " is " + manager.Specialization + " in " + manager.Departement);
		System.out.println("Profile :-");
		System.out.println(manager.name);
		System.out.println(manager.age);
		System.out.println(manager.address);
		System.out.println(manager.phone_Number);
		
	}
	String name = "Amandeep Kaur";
	int age = 24;
	String phone_Number = "7976543221";
	String address = "Bangalore";
	double salary = 70000;
	
	void printSalary() {
		System.out.println("The salary of " + name + " is " + salary);
	}
}

class Employee extends Member{
	String Specialization = "HR";
	String Departement = "HR";
}

class Manager extends Member{
	String Specialization = "Backend Engineer";
	String Departement = "Java";
}

