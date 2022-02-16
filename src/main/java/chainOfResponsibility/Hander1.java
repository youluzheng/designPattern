package chainOfResponsibility;

public class Hander1 extends Handler{
    @Override
    public void HandlerRequest(int i) {
        if(i < 5){
            System.out.println("handler 1 i < 5");
        }else{
            this.getNext().HandlerRequest(i);
        }
    }
}
