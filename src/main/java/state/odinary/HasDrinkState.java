package state.odinary;

public class HasDrinkState extends State{
    public HasDrinkState(SellMachine sellMachine) {
        super(sellMachine);
    }

    void takeOut(){
        System.out.println("take out");
        if (this.sellMachine.getCount() == 0){
            this.sellMachine.setState(this.sellMachine.getSelloutState());
        }else{
            this.sellMachine.setState(this.sellMachine.getNoCoinState());
        }
    }
}
