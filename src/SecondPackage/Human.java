package SecondPackage;

public class Human {
    private String head;

    private String hand;

    private String legs;

    private String brain;

    private String stomach;

    public Human (String stomach,String head,String hand,String legs,String brain){
        this.brain = brain;
        this.hand = hand;
        this.head = head;
        this.legs = legs;
        this.stomach = stomach;

    }


    public String getBrain() {
        return brain;

    }
    public String getHead(){
        return head;
    }
    public String getLegs(){
        return legs;
}
    public String getStomach(){
        return stomach;
}
    public String getHand(){
        return hand;
    }}
