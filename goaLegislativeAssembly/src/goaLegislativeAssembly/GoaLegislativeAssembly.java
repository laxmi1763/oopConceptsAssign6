package goaLegislativeAssembly;

//AUTHOR NAME: LAXMI CHARI
//ROLL NO: 22
//TITLE: IMITATION OF GOA LEGISLATIVE ASSEMBLY
//START DATE: 15/07/2024
//MODIFIED DATE: 22/07/2024
/*DESCRIPTION: THIS CODE IMITATES HOW A SYSTEM WORKS IN GOA LEGISLATIVE ASSEMBLY STARTING WITH A NEW SESSION 
AND DOES THE REQUIRED FUNCTIONS ACCORDINGLY
LIKE INTRODUCING A BILL AND DECLARE IT PASS OR NOT
ADD MLA MEMBERS
HOLDS THE INFORMATION OF THE OFFICIALS IN THE ASSEMBLY -> SPEAKER, DEPUTY SPEAKER, GOVERNOR */



import java.util.ArrayList;
import java.util.Scanner;

public class GoaLegislativeAssembly {
    // Arrays to store sessions, bills, officials, and MLAs
	// Encapsulation: private attributes (sessions, bills, officials, mlas) are used to keep the data secure within the class
    private static ArrayList<Session> sessions = new ArrayList<>();
    private static ArrayList<Bill> bills = new ArrayList<>();
    private static ArrayList<Official> officials = new ArrayList<>();
    private static ArrayList<MLA> mlas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Main method to provide the menu and handle user input
    public static void main(String[] args) {
        int choice;
        do {
            // Display menu options
            System.out.println("\nGoa Legislative Assembly Menu");
            System.out.println("1. Enter the Session Details");
            System.out.println("2. Display Session Details");
            System.out.println("3. Introduce a Bill");
            System.out.println("4. Pass a Bill");
            System.out.println("5. Display Bills");
            System.out.println("6. Add an Official");
            System.out.println("7. View Officials");
            System.out.println("8. Add an MLA");
            System.out.println("9. View MLAs");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            
            // Get user choice
            choice = scanner.nextInt();
            scanner.nextLine(); // Consumes the newline character left by nextInt()

            // Switch case to handle user choice
            switch (choice) {
                case 1:
                    sessionDetails();
                    break;
                case 2:
                    displaySession();
                    break;
                case 3:
                    introduceBill();
                    break;
                case 4:
                    passBill();
                    break;
                case 5:
                    displayBills();
                    break;
                case 6:
                    addOfficial();
                    break;
                case 7:
                    viewOfficials();
                    break;
                case 8:
                    addMLA();
                    break;
                case 9:
                    viewMLAs();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 10); // Loop until the user chooses to exit
    }

    // Method to input session details and add to the session list
    private static void sessionDetails(){
        System.out.print("Enter the Date of the session: ");
        String date = scanner.nextLine();
        System.out.print("Enter the Agenda of the session: ");
        String agenda = scanner.nextLine();
        sessions.add(new Session(date, agenda)); // Adding a new session (object creation)
        System.out.println("Session may proceed.");
    }

    // Method to display session details and associated bills, officials, and MLAs
    private static void displaySession(){
        if (sessions.isEmpty()) {
            System.out.println("No session conducted yet.");
            return;
        }
        // Display all session details
        for (Session session  : sessions) {
            System.out.println(session);  // Polymorphism: calling `toString()` of `Session`
            System.out.println();
        }
        System.out.println("Bills introduced in the session.");
        // Display all bills
        for (Bill bill : bills) {
            System.out.println(bill);  // Polymorphism: calling `toString()` of `Bill`
            System.out.println();
        }
        if (officials.isEmpty()) {
            System.out.println("No officials to display.");
            return;
        }
        System.out.println("Officials present in today's Session:");
        // Display all officials
        for (Official official : officials) {
            System.out.println(official); // Polymorphism: calling `toString()` of `Official`
            System.out.println();
            System.out.println();
        }
        if (mlas.isEmpty()) {
            System.out.println("No MLAs to display.");
            return;
        }
        System.out.println("List of MLAs present for today's session:");
        // Display all MLAs
        for (MLA mla : mlas) {
            System.out.println(mla); // Polymorphism: calling `toString()` of `MLA`
            System.out.println();
        }
    }

    // Method to introduce a new bill
    private static void introduceBill() {
        System.out.print("Enter the title of the bill: ");
        String title = scanner.nextLine();
        System.out.print("Enter the description of the bill: ");
        String description = scanner.nextLine();
        bills.add(new Bill(title, description)); // Adding a new bill (object creation)
        System.out.println("Bill introduced successfully.");
    }

    // Method to pass a bill by updating its status
    private static void passBill() {
        if (bills.isEmpty()) {
            System.out.println("No bills available to pass.");
            return;
        }
        System.out.print("Enter the title of the bill to pass: ");
        String title = scanner.nextLine();
        // Search for the bill with the given title and mark it as passed
        for (Bill bill : bills) {
            if (bill.toString().contains(title)) {
                bill.pass();
                System.out.println("Bill passed successfully.");
                return;
            }
        }
        System.out.println("Bill not found.");
    }

    // Method to display all bills
    private static void displayBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills to display.");
            return;
        }
        for (Bill bill : bills) {
            System.out.println(bill); // Polymorphism: calling `toString()` of `Bill`
            System.out.println();
        }
    }

    // Method to add an official to the list
    private static void addOfficial() {
        System.out.print("Enter the position of the official: ");
        String position = scanner.nextLine();
        System.out.print("Enter the name of the official: ");
        String name = scanner.nextLine();
        officials.add(new Official(position, name));  // Adding a new official (object creation)
        System.out.println("Official added successfully.");
    }

    // Method to view the list of officials
    private static void viewOfficials() {
        if (officials.isEmpty()) {
            System.out.println("No officials to display.");
            return;
        }
        System.out.println("List of Officials:");
        for (Official official : officials) {
            System.out.println(official); // Polymorphism: calling `toString()` of `Official`
            System.out.println();
        }
    }

    // Method to add a new MLA to the list
    private static void addMLA() {
        System.out.print("Enter the name of the MLA: ");
        String name = scanner.nextLine();
        System.out.print("Enter the constituency of the MLA: ");
        String constituency = scanner.nextLine();
        System.out.print("Enter the Political party of the MLA: ");
        String party = scanner.nextLine();
        mlas.add(new MLA(name, constituency, party)); // Adding a new MLA (object creation)
        System.out.println("MLA added successfully.");
    }

    // Method to view the list of MLAs
    private static void viewMLAs() {
        if (mlas.isEmpty()) {
            System.out.println("No MLAs to display.");
            return;
        }
        System.out.println("List of MLAs:");
        for (MLA mla : mlas) { 
            System.out.println(mla); // Polymorphism: calling `toString()` of `MLA`
            System.out.println();
        }
    }
}

