package state.staticState;

public class HasCoinState extends State{
    void pressButton(SellMachine sellMachine){
        System.out.println("press button");
        sellMachine.setState(sellMachine.getHasDrinkState());
    }
}
