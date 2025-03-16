package INPUTOUTPUT;
import java.util.*; 


public class Main {
    public static void main(String[] args) {
        Scanner new_data = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = new_data.nextLine(); // Takes a string input

        System.out.println("Hello, " + name + "!");

        new_data.close(); // Close the scanner
    }
}


public class Main{
	public static void main(String... kathir) {
		Scanner details = new Scanner(System.in);
		System.out.println("Enter the name\nEnter the dob\nEnter the age\nEnter the phone_num\nenter the gender");
		String name = details.nextLine();
		String dob = details.nextLine();
		int age = details.nextInt();
		details.nextLine();
		String phone_num = details.nextLine();
		String gender = details.nextLine(); 
		System.out.println(name+" "+dob+" "+age+" "+phone_num+" "+gender);
		details.close();	 // not important for small program but when use this here then in long program this is realy important.
	}
}


public class Main{
	public static void main(String... kathir) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = d.nextInt();
		System.out.println("Enter your height: (in meters)");
		double height = d.nextDouble();
		System.out.println("are you a student (Ture/Flase):");
		boolean yn = d.nextBoolean();
		System.out.println("Age = "+age);
		System.out.println("height = "+height);
		System.out.println("Student = "+yn);
		d.close();
	}
}








