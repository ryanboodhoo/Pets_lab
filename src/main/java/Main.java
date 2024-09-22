import java.util.Scanner;

public class Main {
         public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many pets do you have");
            int i = scanner.nextInt();

            Animals[] numberofpets = new Animals[i];

            for (int a = 0; a < numberofpets.length; a++) {
                System.out.println("What kind of pet is pet" + " " + (a + 1) + "?");
                String type = scanner.next();
                if (type.equalsIgnoreCase("dog")) {
                    numberofpets[a] = new Animals();
                } else if (type.equalsIgnoreCase("cat")) {
                    numberofpets[a] = new Animals();
                } else if (type.equalsIgnoreCase("bird")) {
                    numberofpets[a] = new Animals();
                }
            }
             for (Animals numberofpet : numberofpets) {
                 numberofpet.makeNoise();


             }
        }
    }
