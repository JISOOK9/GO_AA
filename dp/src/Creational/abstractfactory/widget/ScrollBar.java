package Creational.abstractfactory.widget;

public abstract class ScrollBar {
    String speed = "default";

    public abstract void setSpeed();

    void goDown() {
        System.out.println("go down");
    }

    void goUp() {
        System.out.println("go up");
    }
}
