package state.staticState;

public abstract class State {
    void addCoin(SellMachine sellMachine){
        System.out.println("cant add coin");
    }

    void pressButton(SellMachine sellMachine){
        System.out.println("cant press button");
    }

    void takeOut(SellMachine sellMachine){
        System.out.println("cant take out");
    }

    void fill(SellMachine sellMachine){
        System.out.println("cant fill");
    }
}
