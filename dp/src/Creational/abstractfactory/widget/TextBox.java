package Creational.abstractfactory.widget;

public abstract class TextBox {
    int width = 10;
    public abstract void setWidth();
    void clear() {
        System.out.println("Clear");
    }
    void minimize() {
        System.out.println("Minimize");
    }
}
