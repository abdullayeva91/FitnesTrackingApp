package lesson9;

public class DynamicEntities {
    public static void main(String[] args) {
       Person person=new Person("Ali",25);

       person.describe();
       person.interact();
       person.performAction();
        System.out.println("~~~~~~~~~~~~~~~~~~");



       Vehicle vehicle=new Vehicle("Tesla");
       vehicle.describe();
       vehicle.interact();
       vehicle.performAction();
        System.out.println("~~~~~~~~~~~~~~~~~~");


       Device device=new Device("Smartphone",false);
       device.describe();
       device.interact();
       device.performAction();
       device.interact();


        System.out.println("~~~~~Dynamic Entities System Completed.~~~~~");

    }
}

