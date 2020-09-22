import org.junit.Test;

import javax.swing.text.Utilities;

import static org.junit.jupiter.api.Assertions.*;

public class CardsAndHandsTest {

    private Utilities utility;

    @org.junit.Before
    public  void before() {
        utility = new Utilities();
    }

    @Test
    public void setSuit() {
        assertEquals("this is wrong", utility.setSuit());
    }

    @Test
    public void setRank() {
    }

    @Test
    public void checkHand() {
    }

//    @Test
//    public



}