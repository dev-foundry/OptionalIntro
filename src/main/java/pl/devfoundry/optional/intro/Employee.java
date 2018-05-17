package pl.devfoundry.optional.intro;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {

        this.name = name;
        this.age = age;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
