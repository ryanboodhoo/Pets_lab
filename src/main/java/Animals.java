
import java.util.Scanner;

public class Animals implements Comparable<Animals> {

    private String name;
    private String type; // New field to store the pet type

    Scanner input = new Scanner(System.in);

    // initialize scanner

    public Animals(String type) {
        this.type = type;
        setName();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    @Override
    public int compareTo(Animals o) {
        if (this.getName().equals(o.getName())) {
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}
