import java.util.Scanner;
import java.util.Random;
public class Tulips {
    public static void main(String[] args) {
	Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Tulips! Please enter the amount of Gielinor Pieces you wish to gamble below. Must be between 0 and 999 coins."); // Welcome message and request for input is printed to the player.
		try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int bet = scanner.nextInt(); // This is where the program recieves the players input.
		try {
            Thread.sleep(1000); // 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int GielinorPieces = 1000; // This is how much gold the player will start with.
        if (bet <= GielinorPieces) {
            GielinorPieces -= bet;
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Let the games begin!"); // Message letting the player know the game has started.
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            String[] tulips = {"Cyan", "Magenta", "Yellow"}; // These are the three possible colors that the tulips can be.
            String[] gambledTulips = new String[3]; // This is where the tulips are stored in memory.
            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(tulips.length);
                gambledTulips[i] = tulips[randomIndex];
            }
            System.out.println("First Tulip rolled is: " + gambledTulips[0]);
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Second Tulip rolled is: " + gambledTulips[1]);
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Third Tulip rolled is: " + gambledTulips[2]);
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            if (gambledTulips[0].equals(gambledTulips[1]) && gambledTulips[1].equals(gambledTulips[2])) {
                int cashmoney = bet * 2;
                GielinorPieces += cashmoney;
				try {
					Thread.sleep(1000); // 1 second delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("Excellent! You rolled three of the same color Tulip. You recieve " + cashmoney + " Gielinor Pieces back!");
            } else if (gambledTulips[0].equals(gambledTulips[1]) || gambledTulips[0].equals(gambledTulips[2]) || gambledTulips[1].equals(gambledTulips[2])) {
                GielinorPieces += bet;
				try {
					Thread.sleep(1000); // 1 second delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("Not bad! You rolled two of the same color Tulip. You recieve " + bet + " Gielinor Pieces back.");
            } else {
				try {
					Thread.sleep(1000); // 1 second delay
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.println("Dang! None of the colors of the Tulips match. You lost " + bet + " Gielinor Pieces.");
            }
            System.out.println("Your Gielinor Pieces in the bank: " + GielinorPieces);
        } else {
			try {
				Thread.sleep(1000); // 1 second delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Sorry, you don't have enough Gielinor Pieces in the bank for that."); // This is what is printed if the user enters a number over 1000.
        }
        scanner.close();
    }
}