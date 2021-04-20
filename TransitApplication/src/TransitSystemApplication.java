import java.util.Scanner;

public class TransitSystemApplication {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        boolean exit = false;

        do {
            //clearing the screen before printing the menu
            System.out.print("\033[H\033[2J");
            System.out.flush();

            //main menu for the transit system
            System.out.println("\n Transit System Main Menu");
            System.out.println("\n What would you like to do today?");
            System.out.println("Please select an option below by entering the number for it.");
            System.out.println("\n\t1. Add a new bus");
            System.out.println("\t2. Add a new bus stop for a bus");
            System.out.println("\t3. See all the bus stops for a street");
            System.out.println("\t4. See all the bus stops for a bus");
            System.out.println("\t5. See all the information for all the bus stops");
            System.out.println("\t6. See all the information for all the buses in the system");
            System.out.println("\t7. Exit the program");

            //accepts user input for the menu option they chose
            int option = in.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    //asking the user to add
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:
                    exit = true;
                    break;

                default:
                    System.out.println("Please enter a number from 1-7.");
            }
        } while(!exit);
    }
}
