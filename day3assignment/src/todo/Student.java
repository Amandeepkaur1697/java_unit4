package todo;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int a, String name, int marks) {
		System.out.println("Roll is: "+a);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
	}

	public static void main(String[] args) {
		Student d1 = new Student();
		d1.roll = 01;
		d1.name = "Amandeep Kaur";
		d1.marks = 475;
		d1.displayStudentDetails(d1.roll, d1.name, d1.marks);

		Student d2 = new Student();
		d2.roll = 15;
		d2.name = "Mehak B";
		d2.marks = 500;
		d2.displayStudentDetails(d2.roll, d2.name, d2.marks);
		
		d1 = null;
		d2 = null;
		System.out.println(d1);
		System.out.println(d2);

	}

}
