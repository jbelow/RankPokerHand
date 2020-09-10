/**
 * what the suits can be: "hearts", "spades", "diamonds", "clubs"
 * what the ranks can be: "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
 *
 * @author Joshua Below
 */


public class CardsAndHands {



    private String[] hand = new String[5];
    private int[] suit = new int[5];
    private int[] rank = new int[5];

    public CardsAndHands(int[] suit, int[] rank) {
        setSuit(suit);
        setRank(rank);

    }

    public void setSuit(int[] suit) {
        this.suit = suit;
    }

    public void setRank(int[] rank) {
        this.rank = rank;
    }


    public String checkHand(int[] suit, int[] rank) {

        if (checkFlush()) {

            //1. Royal flush
            if (checkIfAllAbove9()) {
                return "You are a big winner with a royal flush!";
            }

            //2. Straight flush
            if (checkIfInOrder()) {
                return "Ey, you got a straight flush!";
            }

            //5. Flush
            return "You got a flush!";

        } else {

            if (checkIfInOrder()) {
                return "Yay, you got a straight!";
            }

            if (checkSameRank()){
                return "You got four of a kind!";
            }

            return "Tbh you hand isn't anything cool";
        }



//        return "Error: something went wrong";
    }

    /**
     * for to check if same suit
     * @return true if they are all the same suit
     */
    private boolean checkFlush() {

        for (int i = 0; i < 4; i++) {
            if (suit[i] != suit[i + 1]){
                return false;
            }
        }
        return true;
    }

    /**
     * for the straight flush
     * @return true if the ranks are in order without skipping a rank (can't go from 1 to 4 but 1 2 3 4 is ok)
     */
    private boolean checkIfInOrder() {
        int top = rank[0];
        int counter = 0;

        for (int i = 0; i < 5; i++) {
            if (top < rank[i]){
                top = rank[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (top - 1 == rank[j]) {
                    top = rank[j];
                    counter ++;
                }
            }
            if (counter == 4){
                return true;
            }
        }
        return false;
    }

    /**
     * for the royal flush
     * @return true if all of the ranks are above 9
     */
    private boolean checkIfAllAbove9() {

        for (int i = 0; i < 5; i++) {
            if (rank[i] < 10){
                return false;
            }
        }
        return true;
    }

    /**
     * for the four of a kind (this will fail if the two cards on the ends are different but the way it is counting right now will not know)
     * @return true if there are all of the same rank
     */
    private boolean checkSameRank() {
        int OneTime = 0;

        for (int i = 0; i < 4; i++) {
            if (rank[i] != rank[i + 1]){
                OneTime ++;
                //this will save it one time (it is at 2 because it is checked by two for the cards)
                if (OneTime > 2){
                    return false;
                }
            }
        }
        return true;
    }


}
