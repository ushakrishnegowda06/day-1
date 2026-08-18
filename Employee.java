package create;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        String des = "";
        double salary = 0;
        int ch;

        System.out.println("1. Create");
        System.out.println("2. Display");
        System.out.println("3. Raise Salary");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                sc.nextLine();
                System.out.print("Enter Name: ");
                name = sc.nextLine();

                System.out.print("Enter Age: ");
                age = sc.nextInt();

                sc.nextLine();
                System.out.print("Enter Designation: ");
                des = sc.nextLine();

                System.out.print("Enter Salary: ");
                salary = sc.nextDouble();
                break;

            case 2:
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Designation: " + des);
                System.out.println("Salary: " + salary);
                break;

            case 3:
                System.out.print("Enter Raise Amount: ");
                salary = salary + sc.nextDouble();
                System.out.println("New Salary: " + salary);
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}