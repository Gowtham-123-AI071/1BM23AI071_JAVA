import java.util.*;

public class GymMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------  GYM MEMBERSHIP MANAGEMENT ------------------");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter membership status (Active/Inactive): ");
        String mem_status = scanner.nextLine();

        System.out.print("Enter membership duration (in months): ");
        int duration = scanner.nextInt();

        // Assuming monthly fee as 1500/-
        double monthlyFee = 1500.00;
        double totalFee = duration * monthlyFee;

        System.out.println("\n----------------  MEMBERSHIP DETAILS ----------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership status: " + mem_status);
        System.out.println("Membership duration: " + duration + " months");
        System.out.printf("Membership fee: "+ totalFee);
    }
}

//-----------------  GYM MEMBERSHIP MANAGEMENT ------------------
//Enter name: megharaj
//Enter age: 19
//Enter membership status (Active/Inactive): true
//Enter membership duration (in months): 12
//
//        ----------------  MEMBERSHIP DETAILS ----------------
//Name: madhu
//Age: 19
//Membership status: true
//Membership duration: 12 months
//Membership fee: 18000.0
//Process finished with exit code 0