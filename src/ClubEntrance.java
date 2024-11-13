import java.util.Scanner;

/**
 * Title: Club Entrance
 *
 * Description: This program simulates the entrance and exit control system of a club.
 * It keeps track of the number of occupants in the club, allowing people to enter or
 * leave while ensuring that the number of occupants does not exceed the club's maximum
 * capacity. The program ends once the club reaches maximum capacity.
 */

public class ClubEntrance {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalOccupants = 0;
        final int MAX_CAPACITY = 100;
        boolean clubFull = false;

        // loop until club is full
        while (!clubFull) {
            System.out.print("Enter how many people want to enter or leave the club: ");
            // get user input
            int groupSize = keyboard.nextInt();

            // handle group entering the club
            if (groupSize > 0) {
                if (totalOccupants + groupSize <= MAX_CAPACITY) {
                    totalOccupants += groupSize;
                    System.out.println("Currently there are " + totalOccupants + " people in the club.");
                } else {
                    System.out.println("The group is too large to enter the club.");
                    System.out.println("Currently there are " + totalOccupants + " people in the club.");
                }
                // handle group leaving the club
            } else if (groupSize < 0) {
                int numLeaving = Math.abs(groupSize);
                if (numLeaving >= totalOccupants) {
                    totalOccupants = 0;
                    System.out.println("Everyone has left the club.");
                } else {
                    totalOccupants -= numLeaving;
                }
                System.out.println("Currently there are " + totalOccupants + " people in the club.");
            }

            // Check if club reached maximum capacity
            if (totalOccupants == MAX_CAPACITY) {
                System.out.println("The club is at capacity. Program will end.");
                clubFull = true;
            }
        }
    }
}
