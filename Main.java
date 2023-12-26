package Java.OOP_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        
        Person person1 = new Buyer("John");
        Person person2 = new Buyer("Alice");
        
        market.acceptToMarket(person1);
        market.acceptToMarket(person2);
        
        market.update();
        
        List<Person> customersInMarket = new ArrayList<>();
        customersInMarket.add(person1);
        customersInMarket.add(person2);
        market.releaseFromMarket(customersInMarket);
        
        market.update();
    }
}

    

