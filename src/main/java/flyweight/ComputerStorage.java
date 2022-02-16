package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ComputerStorage {
    Map<String, Computer> computerList = new HashMap<>();

    public Computer getComputer(String brand){
        if (this.computerList.containsKey(brand)){
            System.out.println("get " + brand + " computer");
            return this.computerList.get(brand);
        }else{
            Computer computer = new Computer(brand);
            this.computerList.put(brand, computer);
            System.out.println("buy " + brand + " computer");
            return computer;
        }
    }
}
