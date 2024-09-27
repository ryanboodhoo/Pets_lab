
import java.util.Scanner;

public class Animals {

    private String name;
    Scanner input = new Scanner(System.in);

    // initialize scanner

    public Animals() {
        setName();
    } //setter


    public String getName() {
        return name;
    } //getter for name

    public void setName() { //setter setName
        // making a method that asks user to enter name
        System.out.println("Enter name"); // prints out "enter name "
        name = input.nextLine(); // stores input in name variable
    }


    public void makeNoise() { //method that prints out the name the user inputted + "is making noise"
        System.out.println(name + " " + "is making noise");
    }
}