package student;

public class EvenorOdd {
	public void func(int a) {
		if(a%2==1) {
			System.out.println(a);
		}
		else if(a%2==0) {
			// Smaller multiple
	        int b = (a / 10) * 10;
	          
	        // Larger multiple
	        int c = b + 10;
	        System.out.println(c);
		}
		else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		EvenorOdd e1 = new EvenorOdd();
		e1.func(56);

	}

}
