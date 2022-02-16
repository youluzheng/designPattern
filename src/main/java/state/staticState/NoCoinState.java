package state.staticState;

public class NoCoinState extends State{

    void addCoin(SellMachine sellMachine){
        System.out.println("add coin");
        sellMachine.setState(sellMachine.getHasCoinState());
    }

    void fill(){
        System.out.println("fill in no coin state");
    }
}
