package oop;

import java.util.ArrayList;

/**
 * Person App
 * Simple class to model a Person
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "\n*** Person App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        // Create (instantiate) a new Person object
        // Initialize it by passing argument values into the constructor
        // The reference "person1" is assigned a reference to the new Person object
        // (person1 points at the Person object) -

        Person person1 = new Person("Taylor Swift", "Reading, Pennsylvania", 25);

        System.out.println("person1 name: " + person1.getName());
        System.out.println("person1 address: " + person1.getAddress());
        System.out.println("person1 age: " + person1.getAge());

        // Create an object using no-argument constructor
        Person person2 = new Person();
        System.out.println();
        System.out.println("person2 name :" + person2.getName());
        System.out.println("[name is blank above because no-arg constructor set it to an empty string]");

        // Set the instance fields of the Person
        // object person2 using the setter methods
        person2.setName("Andrew Hozier-Byrne");
        person2.setAddress("Bray, Co. Wicklow");
        person2.setAge(25);

        System.out.println();
        System.out.println("person2 name: " + person2.getName());
        System.out.println("person2 address: " + person2.getAddress());
        System.out.println("person2 age: " + person2.getAge());

        System.out.println("");
        System.out.println("Display person1 using toString() : " + person1.toString() );
        System.out.println("Display person2 using toString() : " + person2 );   // will call toString() on object
        person1.print();
        person2.print();

        ArrayList<Person> people = new ArrayList();
        people.add(person1);
        people.add(person2);
        Person person3 = new Person("Conor McGuire", "Navan, Meath", 18);
        people.add(person3);

        for (int i = 0; i < people.size(); i++) {
            people.get(i).print();
        }

    }
}
