package state.odinary;

public class NoCoinState extends State{
    public NoCoinState(SellMachine sellMachine) {
        super(sellMachine);
    }

    void addCoin(){
        System.out.println("add coin");
        this.sellMachine.setState(this.sellMachine.getHasCoinState());
    }

    void fill(){
        System.out.println("fill in no coin state");
    }
}
