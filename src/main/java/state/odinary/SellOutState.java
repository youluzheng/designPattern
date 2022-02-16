package state.odinary;

public class SellOutState extends State{
    public SellOutState(SellMachine sellMachine) {
        super(sellMachine);
    }

    void fill(){
        System.out.println("fill in sell out state");
        this.sellMachine.setState(this.sellMachine.getNoCoinState());
    }
}
