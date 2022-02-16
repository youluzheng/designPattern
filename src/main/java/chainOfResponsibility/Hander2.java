package chainOfResponsibility;

public class Hander2 extends Handler {
    @Override
    public void HandlerRequest(int i) {
        if(i < 10){
            System.out.println("handler 2 i < 10");
        }else{
            this.getNext().HandlerRequest(i);
        }
    }
}
