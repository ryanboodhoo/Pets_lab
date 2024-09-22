
import java.util.Scanner;

public class Animals {
    private String name;
    Scanner input = new Scanner(System.in);

    public Animals() {
        setName();
    }

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("Enter name");
        name = input.nextLine();
    }
    public void setName(String name){
        this.name = name;
    }
    public void makeNoise(){
        System.out.println(name + " " + "is making noise");
    }
}
