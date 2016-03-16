import Cards.*;
import Player.*;

public class RunningGame {
    public static void main(String[] args){

        Hand test = new Hand();
        Card melee = new CardMelee();
        Card ranged = new CardRanged();

        test.putCardIntoPlay(ranged);

    }
}
