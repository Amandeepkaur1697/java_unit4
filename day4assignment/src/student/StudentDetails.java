package student;

public class StudentDetails {
	Student s1 = new Student();
	   
	   StudentDetails(){
		   
	   }
	   StudentDetails(int roll,int age,int marks,String name){
		   s1.StudentDetail(roll,age,marks,name);
	   }

	public static void main(String[] args) {
		StudentDetails student1 = new StudentDetails();
		   student1.s1.StudentDetail(01, 24, 475, "Amandeep Kaur");	   
		   StudentDetails student2 = new StudentDetails(15, 22, 450, "Mehak B");

	}

}
