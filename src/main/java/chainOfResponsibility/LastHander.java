package chainOfResponsibility;

public class LastHander extends Handler{
    @Override
    public void HandlerRequest(int i) {
        System.out.println("last handler  i = " + i);
    }
}
