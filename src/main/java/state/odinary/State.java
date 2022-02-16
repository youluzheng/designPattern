package state.odinary;

public abstract class State {
    protected SellMachine sellMachine;

    protected State(SellMachine sellMachine){
        this.sellMachine = sellMachine;
    }

    void addCoin(){
        System.out.println("cant add coin");
    }

    void pressButton(){
        System.out.println("cant press button");
    }

    void takeOut(){
        System.out.println("cant take out");
    }

    void fill(){
        System.out.println("cant fill");
    }
}
