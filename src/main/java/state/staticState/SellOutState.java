package state.staticState;

public class SellOutState extends State{

    void fill(SellMachine sellMachine){
        System.out.println("fill in sell out state");
        sellMachine.setState(sellMachine.getNoCoinState());
    }
}
