package looping_programs;
//Amstrong Number

public class Program15 {


	public static void main(String[] args) {
		Program15 obj = new Program15();
		
		int result = obj.print_amstrong(153);
		if(153==result) {
			System.out.println("The given no is Amstrong");
			
		}
		else {
		System.out.println("The given no is not Amstrong");

	}
		
	}
	
	int print_amstrong(int no) {
		//int no = 153;
		int amr = 0;
		int rem = 0;
		while(no>0) {
			rem = no%10;
			amr =amr+(rem*rem*rem);
			no= no/10;
		}
		return amr;
	}

}
