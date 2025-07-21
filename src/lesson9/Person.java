package lesson9;

public class Person extends Entity implements Actable{
    int age;

    public Person(String name, int age) {
        super(name);
        this.age = age;


    }

    @Override
    public void describe() {
        System.out.println(name+" ("+ age+")");


    }


    @Override
    public void interact() {
        System.out.println(name+" says: Hello ");

    }

    @Override
    public void performAction() {
        System.out.println(name+"is learning");
    }
}
