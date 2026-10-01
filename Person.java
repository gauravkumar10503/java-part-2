import java.util.Scanner;

public class Person {
    // Fields
    private String name;
    private int age;

    // Constructor that uses Scanner to get user input
    public Person() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

        // Optional: Close scanner if not used elsewhere
        // scanner.close(); // Only close if no other input needed later
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        Person person = new Person();
        person.displayInfo();
    }
}
