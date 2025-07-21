package lesson9;

public class Vehicle extends Entity implements Actable{
    String type;



    public Vehicle(String name) {
        super(name);
        this.type = type;

    }

    @Override
    public void describe() {
        System.out.println("Car"+ type+""+name);
    }

    @Override
    public void interact() {
        System.out.println(name+"Is starting up");
    }

    @Override
    public void performAction() {
        System.out.println(name+"Is moving");
    }
}
