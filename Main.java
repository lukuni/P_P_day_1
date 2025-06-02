public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 30);

        person1.greet();

        Person person2 = new Person("Jane Smith", 25);

        person2.greet();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}