package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler firstHander = new Hander1();
        firstHander.addHandler(new Hander2());
        firstHander.addHandler(new LastHander());
        firstHander.HandlerRequest(10);
    }
}
