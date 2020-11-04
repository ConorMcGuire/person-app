package oop;

public class Person {

    // Instance variables (or fields) are normally private
    private String name;
    private String address;
    private int age;

    // Constructors - are called to initialize fields during object creation
    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // The "no-argument" (default) constructor
    public Person()
    {
        name = "";
        address = "";
        age = 0;
    }

    // Instance Methods
    // Getter methods (Accessors)

    public String getName() { return this.name; }
    public String getAddress() { return this.address; }
    public int getAge() { return this.age; }

    // Setter methods (Mutators)
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setAge(int age) { this.age = age; }

    //DONE
    // Implement toString() method.  Can also be auto generated.
    @Override
    public String toString()
    {
        return "Name: " + this.name + " Address: " + this.address + " Age: " + this.age;
    }


    //DONE
    // Implement a print() method that simply prints the names
    // and values of each field in Person. Call print() from start().
    public void print()
    {
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.age+"\n");
    }


}
