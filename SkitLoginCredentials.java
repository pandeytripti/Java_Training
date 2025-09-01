package Myanatomy;
import java.util.*;
public class SkitLoginCredentials {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        System.out.print("Enter First Name: ");
	        String first = sc.next();
	        System.out.print("Enter Last Name: ");
	        String last = sc.next();

	     
	        System.out.println("Select Department: \n1.Technical\n2.Admin\n3.HR\n4.Legal");
	        String dept = switch (sc.nextInt()) {
	            case 1 -> "Technical";
	            case 2 -> "Admin";
	            case 3 -> "HR";
	            case 4 -> "Legal";
	            default -> "General";
	        };

	        sc.nextLine();
	        System.out.print("Enter Position: ");
	        String pos = sc.nextLine();

	        
	        String email = first.toLowerCase() + "." + last.toLowerCase() + "@" + dept.toLowerCase() + ".skit.ac.in";

	      
	        String chars = "ABCDEFGHI56789@#$%&";
	        Random r = new Random();
	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < 8; i++) password.append(chars.charAt(r.nextInt(chars.length())));

	    
	        System.out.println("\n--- Employee Credentials ---");
	        System.out.println("Name: " + first + " " + last);
	        System.out.println("Email: " + email);
	        System.out.println("Department: " + dept + " | Position: " + pos);
	        System.out.println("Password: " + password);

	    
	    }
	}

