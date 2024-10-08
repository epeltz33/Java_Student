package apps;

import classes.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassRoster {
    private static final List<Student> roster = new ArrayList<>();

    public static void main(String[] args) {
        initializeRoster();
        runUserInterface();
    }

    private static void initializeRoster() {
        // Add at least 20 non-trivially unique students
        roster.add(new Student("Ryan", "Hansen", "banana", 12, 2.00F));
        roster.add(new Student("Robert", "Sanchez Tlanipa", "Apples", 6, 1.50F));
        roster.add(new Student("Brooke", "Ruzak", "Kit-Kat", 10, 1.50F));
        roster.add(new Student("Jp", "Martinez", "Popcorn", 24, 3.49F));
        roster.add(new Student("Elizabet", "Mellado", "cookies", 60, 3.50F));
        roster.add(new Student("Praneetha", "Kone", "cookies", 54, 6.88F));
        roster.add(new Student("Beatriz", "Santana", "goldfish", 13, 3.00F));
        roster.add(new Student("Yash", "Gajjar", "FrenchFries", 14, 3.50F));
        roster.add(new Student("Emilia", "Karpman", "oreos", 16, 5.60F));
        roster.add(new Student("Andrea", "Parker", "Milky Way", 10, 0.10F));
        roster.add(new Student("Marilin", "Rodriguez", "milk chocolate", 12, 2.00F));
        roster.add(new Student("Arthur", "Fumarola", "Chips", 12, 5.0F));
        roster.add(new Student("Yordelie", "Cabreja", "Candy", 13, 5.5F));
        roster.add(new Student("Mitch", "Toran", "popcorn", 9, 6.50F));
        roster.add(new Student("Zubin", "Chowdhuri", "Sushi", 12, 6.99F));
        roster.add(new Student("Joe", "Certo", "steak", 46, 5.2F));
        roster.add(new Student("Tyler", "Robbins", "Cookies", 12, 0.00F));
        roster.add(new Student("Eric", "Peltzman", "Doritos", 12, 3.50F));
        roster.add(new Student("Emma", "Garcia", "Chocolate", 20, 2.50F));
        roster.add(new Student("Alex", "Lopez", "Yogurt", 11, 3.75F));
        roster.add(new Student("Olivia", "Clark", "Carrots", 19, 1.25F));
    }

    private static void runUserInterface() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nClass Roster Menu:");
            System.out.println("1. Display roster in random order");
            System.out.println("2. Display roster sorted by credits (most to least)");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayRandomOrder();
                    break;
                case 2:
                    displaySortedByCredits();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayRandomOrder() { // Display the roster in random order
        List<Student> shuffledRoster = new ArrayList<>(roster);
        Collections.shuffle(shuffledRoster); // using collections to shuffle the list
        displayRoster(shuffledRoster);
    }

    private static void displaySortedByCredits() { // Display the roster in sorted order
        List<Student> sortedRoster = new ArrayList<>(roster);
        Collections.sort(sortedRoster);
        displayRoster(sortedRoster);
    }

    private static void displayRoster(List<Student> students) {
        System.out.println("\nClass Roster:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}