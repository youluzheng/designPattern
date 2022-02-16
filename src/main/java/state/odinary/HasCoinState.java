package state.odinary;

public class HasCoinState extends State{
    public HasCoinState(SellMachine sellMachine) {
        super(sellMachine);
    }

    void pressButton(){
        System.out.println("press button");
        this.sellMachine.setState(this.sellMachine.getHasDrinkState());
    }
}
