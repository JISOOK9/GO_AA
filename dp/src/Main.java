import Creational.abstractfactory.AbstractFactoryWidgetClient;

public class Main {
    public static void main(String[] args) {
        //StrategyP Behavior.strategy = new StrategyP();
        Object test = new AbstractFactoryWidgetClient("Windows");
    }
}
