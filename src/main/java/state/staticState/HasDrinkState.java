package state.staticState;

public class HasDrinkState extends State{
    void takeOut(SellMachine sellMachine){
        System.out.println("take out");
        if (sellMachine.getCount() == 0){
            sellMachine.setState(sellMachine.getSelloutState());
        }else{
            sellMachine.setState(sellMachine.getNoCoinState());
        }
    }
}
