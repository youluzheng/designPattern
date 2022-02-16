package state.staticState;

public class SellMachine {

    private int count;

    private static State NoCoinState =  new NoCoinState();
    private static State HasCoinState = new HasCoinState();
    private static State HasDrinkState = new HasDrinkState();
    private static State SelloutState = new SellOutState();
    private State currentState;

    public SellMachine(int count){
        this.count = count;
        if(count == 0){
            this.currentState = SellMachine.SelloutState;
        }else{
            this.currentState = SellMachine.NoCoinState;
        }
    }

    void addCoin(){
        this.currentState.addCoin(this);
    }

    void pressButton(){
        this.currentState.pressButton(this);
    }

    void takeOut(){
        this.count--;
        this.currentState.takeOut(this);
    }

    void fill(int count){
        this.count += count;
        this.currentState.fill(this);
    }

    public void setState(State state){
        this.currentState = state;
    }

    public int getCount(){
        return this.count;
    }

    public State getNoCoinState() {
        return SellMachine.NoCoinState;
    }

    public State getHasCoinState() {
        return SellMachine.HasCoinState;
    }

    public State getHasDrinkState() {
        return SellMachine.HasDrinkState;
    }

    public State getSelloutState() {
        return SellMachine.SelloutState;
    }
}
