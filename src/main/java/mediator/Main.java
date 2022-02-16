package mediator;

public class Main {
    public static void main(String[] args) {
        Mediator computerPlatform = new ComputerPlatform();
        Colleague buyer = new BuyerColleague();
        Colleague seller = new SellerColleague();
        computerPlatform.register(buyer);
        computerPlatform.register(seller);
        buyer.send("我想要买电脑");
        seller.send("我想要卖电脑");
    }
}
