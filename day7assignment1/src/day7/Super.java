package day7;

public class Super {
	String x = "Sonia";

	public static void main(String[] args) {
		thisInherit thisI = new thisInherit();
		thisI.call();
	}	
			
	}
	class thisInherit extends Super{
		String x = "Mehak";
		
		void call() {
			System.out.println(this.x);
			//this will print the explicit nearest x variable.
			
			//But if we want to call the parent variable then we have to use Super keyword.//
			System.out.println(super.x);
		}
	}



