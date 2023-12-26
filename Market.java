package Java.OOP_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private List<Person> queue;
    private List<Person> market;

    public Market() {
        queue = new ArrayList<>();
        market = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Person person) {

        queue.add(person);
        takeInQueue(person);
        
    }

    @Override
    public void releaseFromMarket(List<Person> personList) {

        queue.removeAll(personList);
        market.addAll(personList);
        giveOrders();
      
    }

    @Override
    public void update() {
        
        takeOrders();
        releaseFromQueue(); 
             
    }

    @Override
    public void takeInQueue(Person person) {

        System.out.println("Person " + person + " has taken a place in the queue");
                
    }
    @Override
    public void takeOrders() {
        
        System.out.println("Taking orders for customers in the queue");
    
    }

    @Override
    public void giveOrders() {
        
        System.out.println("Giving orders for customers in the market");

    }

    @Override
    public void releaseFromQueue() {

        System.out.println("Realeasing customers from the queue");
        
    }
    
}