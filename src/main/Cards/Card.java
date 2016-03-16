package Cards;

public class Card {
    private String name;
    private String description;
    private int score;
    private int type; // weather, ranged, sieged, melee
    private int effect; //spy, multiplier
    private int hero;

    public void selectedCard(String cardName, String cardDescription, int cardDamageAmount, String cardAbility){
//        System.out.println("This card in on the board");
        System.out.printf("%s - %s\n %s \n %d", cardName, cardAbility, cardDescription, cardDamageAmount);
    }


    //constructor
    public Card(String cardName, String cardDescription, int cardType, int cardEffect){
        name = cardName;
        description = cardDescription;
        type = cardType;
        effect = cardEffect;
    }

    //add the rest
    public Card(String cardName, String cardDescription, int cardType, int cardEffect){
        name = cardName;
        description = cardDescription;
        type = cardType;
        effect = cardEffect;
    }




}
