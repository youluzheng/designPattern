package mediator;

public class BuyerColleague extends Colleague{

    @Override
    public void receive(String message) {
        System.out.println("买家收到消息:" + message);
    }

    @Override
    public void send(String message) {
        this.mediator.delay("buyer", message);
    }
}
