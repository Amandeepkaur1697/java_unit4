package todo;

public class VowelConsonant {
	void check(char a) {
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			System.out.println("Vowel");
		}
		else if(a=='b' || a=='c' || a=='d' || a=='f' || a=='g' || 
				a=='h' || a=='j' || a=='k' || a=='l' || a=='m' || 
				a=='n' || a=='p' || a=='q' || a=='r' || a=='s' || 
				a=='t' || a=='v' || a=='w' || a=='x' || a=='y' || a=='z') {
			System.out.println("Consonant");
		}
		else {
			System.out.println("invalid character");
		}
	}

	public static void main(String[] args) {
		VowelConsonant c = new VowelConsonant();
		char a = 'c';
		c.check(a);

	}

}
