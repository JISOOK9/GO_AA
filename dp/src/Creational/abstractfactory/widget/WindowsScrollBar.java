package Creational.abstractfactory.widget;

public class WindowsScrollBar extends ScrollBar {

    WindowsScrollBar() {
        setSpeed();
        System.out.println("Windows scroll created with speed : " + speed);
    }

    @Override
    public void setSpeed() {
        speed = "fast";
    }
}
