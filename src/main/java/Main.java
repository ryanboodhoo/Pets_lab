import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //initialized scanner
        System.out.println("How many pets do you have"); // Printing out how many pets do you have to the user inside the scanner
        int i = scanner.nextInt(); //stores the number of how many pets the user inputs


        Animals[] numberofpets = new Animals[i]; // Make an array of animal objects with the length of the array being how many pets the user has

        for (int a = 0; a < numberofpets.length; a++) { // looping through the numberofpets array
            System.out.println("What type of pet is pet" + " " + (a + 1) + "?");
            // Printing the type of pet for the current iteration of the loop.
            // 'a' is the integer variable representing the current index of the loop.
            // We add 1 to 'a' because array indices start at 0, but we want the pet numbers to start at 1.
            // This prints a prompt for each pet based on the length of the numberofpets array.


            String type = scanner.next(); // We store the type of pet the user inputs inside the variable String type
            if (type.equalsIgnoreCase("dog")) {// if type equals dog
                numberofpets[a] = new Dog(); // Add a new Dog object to the numberofpets array at the current index of 'a'
            } else if (type.equalsIgnoreCase("cat")) { // Add a new Cat object to the numberofpets array at the current index of 'a'
                numberofpets[a] = new Cat(); // make a new cat object
            } else if (type.equalsIgnoreCase("bird")) { // if type equals to bird
                numberofpets[a] = new Bird(); // Add a new Bird object to the numberofpets array at the current index of 'a'
            }
        }

//        // sorting name with Comparable breaking ties by class type
        Arrays.sort(numberofpets);

        for (Animals numberofpet : numberofpets) { //looping through the list of pets the user inputs
            numberofpet.makeNoise(); // calling the makeNoise method
        }

        Arrays.sort(numberofpets, new AnimalsComparator());

        System.out.println("=====================================================");

        // sorting type with Comparator breaking ties by name
        for (Animals numberofpet : numberofpets) { //looping through the list of pets the user inputs
            numberofpet.makeNoise(); // calling the makeNoise method
        }





    }
}














    /*
    initialized scanner
    prompt the user how many pets do they have
    store the number of pets inside an int

    repeatably ask:
        prompt the user for pet type then name
        stores that name inside a separate Strings
         because we are only asking for one name at a time
         then print out the name while the pet is speaking

        prompt the user what kind of pet what kind of do they own
        if the user the types in dog
            create new dog object
        otherwise the user the types in cat
            create new cat object
        otherwise the user the types in bird
                    create new bird object

         then we need to make the object speak/ make noise
         example call dog is speaking then only dog speaking
                 call cat is speaking then only that cat speaking
                 call bird is speaking then only that bird speaking
 */





