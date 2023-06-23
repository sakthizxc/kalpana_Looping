package looping_programs;

//palindrome
public class Program14 {

	public static void main(String[] args) {

	
		Program14 obj = new Program14();
		int result = obj.reverse(353);
		if(353==result) {
		System.out.println("The given no is Palindrome");
	}
		else {
			System.out.println("The given no is not Palindrome");
		}
	}

	 int reverse(int no) {
		int sum = 0;
	
	while (no>0) {
		sum = (sum*10)+(no%10);
		no = no/10;
	}
	return sum;
	}
		
	
}
