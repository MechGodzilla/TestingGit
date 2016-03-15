import Cards.*;
import Player.*;

public class RunningGame {
    public static void main(String[] args){
        Hand test = new Hand();
        Card melee = new Melee();
        Card siege = new Siege();

        test.putCardIntoPlay(melee);

    }
}
