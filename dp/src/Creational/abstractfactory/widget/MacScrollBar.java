package Creational.abstractfactory.widget;

public class MacScrollBar extends ScrollBar {

    MacScrollBar() {
        setSpeed();
        System.out.println("mac scroll created with speed : " + speed);
    }

    @Override
    public void setSpeed() {
        speed = "slow";
    }
}
