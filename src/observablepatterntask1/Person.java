package observablepatterntask1;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{

    // set a backing field
    private String personName;

    public String getPersonName() {
        return personName;
    }

    // ctor
    public Person(String newName) {
        personName = newName;
    }

    // mandatory method because implements Observer
    public void update(Observable mySubject, Object prodName) {
        System.out.println("Hello "+ getPersonName() +", the " + (String) prodName + " is now in stock.");
    }
}