package Java.OOP_2;

public abstract class Person implements PersonBehaviour {
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected final String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getName();
    
}
