package mediator;

public class SellerColleague extends Colleague {

    @Override
    public void receive(String message) {
        System.out.println("卖家收到消息:" + message);
    }

    @Override
    public void send(String message) {
        this.mediator.delay("seller", message);
    }
}
