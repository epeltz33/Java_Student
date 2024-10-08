package classes;

import java.util.Random;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String favSnack;
    private int credits;
    private float costBeverage;
    private final int studentID;

    private static final Random random = new Random(); // Random number generator for studentID

    public Student() {
        // Default constructor
        this.studentID = random.nextInt(1000); // Random number between 0 and 999
    }

    public Student(String firstName, String lastName, String favSnack, int credits, float costBeverage) {
        this(); // Call the default constructor to generate a random studentID for this student
        this.firstName = firstName;
        this.lastName = lastName;
        this.favSnack = favSnack;
        this.credits = credits;
        this.costBeverage = costBeverage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavSnack() {
        return favSnack;
    }

    public void setFavSnack(String favSnack) {
        this.favSnack = favSnack;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getCostBeverage() {
        return costBeverage;
    }

    public void setCostBeverage(float costBeverage) {
        this.costBeverage = costBeverage;
    }

    @Override
    public String toString() {
        return String.format("ID:%04d | %s %s | Snack: %s | Credits: %d | Beverage: $%.2f",
                studentID, firstName, lastName, favSnack, credits, costBeverage);
    }
    @Override
    public int compareTo(Student other) {
        // COmpare based on the credits first, then lastName IF credits are equal
        int creditCompare = Integer.compare(other.credits, this.credits);
        if (creditCompare != 0) { // If credits are not equal, return the comparison
            return creditCompare;
        }
        return this.lastName.compareTo(other.lastName); //Sort by  last names if credits are equal
    }
}