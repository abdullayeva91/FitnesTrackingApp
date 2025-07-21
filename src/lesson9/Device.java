package lesson9;

public class Device extends Entity implements Actable {
    boolean isOn=false;

    public Device(String name, boolean isOn) {
        super(name);
        this.isOn = isOn;
    }

    @Override
    public void describe() {
        System.out.println("Device:  "+name);
    }

    @Override
    public void interact() {
        if (!isOn){
            isOn=true;
            System.out.println(name+" Has been turned on");
        }else {
            isOn=false;
            System.out.println(name+" Has been turned off");
        }

    }

    @Override
    public void performAction() {
        System.out.println(name+"Is performing its function");

    }
}
