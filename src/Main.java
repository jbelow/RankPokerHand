import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int[] suit = new int[5];
        int[] rank = new int[5];


        System.out.println("Welcome to cards and hands where you can find out what is a good hand!");

        //for loop to ask what card they want
        for (int i = 0; i < 5; i++){
            System.out.println("for your " + (i + 1) + " card ");
            System.out.println("Please pick a suit (1 for hearts, 2 for spades, 3 for diamonds, or 4 for clubs): ");
            suit[i] = Integer.parseInt(scanner.nextLine());

            System.out.println("Please pick a rank (2 - 10, 11 for Jack, 12 for Queen, 13 for King, or 14 for Ace): ");
            rank[i] = Integer.parseInt(scanner.nextLine());

        }

        CardsAndHands userCards = new CardsAndHands(suit, rank);


        System.out.println(userCards.checkHand(suit, rank));



    }
}
