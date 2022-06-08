package day7;

public class Student {
	int studentId = 15;
	String studentName = "Sonia";
	double examfees = 1000;
	double totalPaid = 8000;
	
	void displayDetails() {
		System.out.println("Name : " + studentName + "\n" + "Id : " + studentId);
	}
	void payFee() {
		System.out.println("The fess for the exam is " + examfees);
	}
	
	
	public static void main(String[] args) {
		DayScholor dayscholor = new DayScholor();
		double remainingFee;
		double totalFee = (dayscholor.examfees + dayscholor.transportFee);
		remainingFee = totalFee - dayscholor.totalPaid;
		if(totalFee < dayscholor.totalPaid) {
			System.out.println("Student 1 : Fee cleared !!");
		}else {
			System.out.println("Student 1 : " + dayscholor.studentName + " is left to pay Rs." + remainingFee);
		}
		
		Hosteller hosteller = new Hosteller();
		double totalPaid = 8000;
		totalFee = (hosteller.examfees + hosteller.hostelFee);
		remainingFee = (totalFee - totalPaid);
		if(totalFee < hosteller.totalPaid) {
			System.out.println(" Studnt 2 : Fee cleared !!");
		}else {
			System.out.println("Student 2 : " + dayscholor.studentName + " is left to pay Rs." + remainingFee);
		}
	}

}

class DayScholor extends Student{
	double transportFee = 657;
	void transportFee() {
		System.out.println("Transport fess is " + transportFee);
	}
}
class Hosteller extends Student{
	double hostelFee = 5677;
	void hostelFee() {
		System.out.println("Hostel fee is " + hostelFee);
	}
}

