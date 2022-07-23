package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {

    Handler next;

    public void setNext(Handler next){
        this.next = next;
    }

    public Handler getNext(){
        return next;
    }

    public abstract void HandlerRequest(int i);
}
