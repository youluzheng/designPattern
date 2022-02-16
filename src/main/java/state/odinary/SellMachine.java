package state.odinary;

public class SellMachine {

    private int count;

    private State NoCoinState;
    private State HasCoinState;
    private State HasDrinkState;
    private State SelloutState;
    private State currentState;

    public SellMachine(int count){
        this.NoCoinState = new NoCoinState(this);
        this.HasCoinState = new HasCoinState(this);
        this.HasDrinkState = new HasDrinkState(this);
        this.SelloutState = new SellOutState(this);
        this.count = count;
        if(count == 0){
            this.currentState = this.SelloutState;
        }else{
            this.currentState = this.NoCoinState;
        }
    }

    void addCoin(){
        this.currentState.addCoin();
    }

    void pressButton(){
        this.currentState.pressButton();
    }

    void takeOut(){
        this.count--;
        this.currentState.takeOut();
    }

    void fill(int count){
        this.count += count;
        this.currentState.fill();
    }

    public void setState(State state){
        this.currentState = state;
    }

    public int getCount(){
        return this.count;
    }

    public State getNoCoinState() {
        return NoCoinState;
    }

    public State getHasCoinState() {
        return HasCoinState;
    }

    public State getHasDrinkState() {
        return HasDrinkState;
    }

    public State getSelloutState() {
        return SelloutState;
    }
}
