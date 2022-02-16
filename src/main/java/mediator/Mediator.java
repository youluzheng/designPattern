package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> sellerColleagues = new ArrayList<>();
    protected List<Colleague> buyerColleagues = new ArrayList<>();
    void register(Colleague colleague){
        if(colleague instanceof SellerColleague){
            this.sellerColleagues.add(colleague);
        }else{
            this.buyerColleagues.add(colleague);
        }
        colleague.setMediator(this);
    }

    public abstract void delay(String type, String message);
}
