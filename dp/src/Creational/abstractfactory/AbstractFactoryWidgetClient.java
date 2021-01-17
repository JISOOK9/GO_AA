package Creational.abstractfactory;

import Creational.abstractfactory.widget.GUIFactory;
import Creational.abstractfactory.widget.MacGuiFactory;
import Creational.abstractfactory.widget.ScrollBar;
import Creational.abstractfactory.widget.TextBox;
import Creational.abstractfactory.widget.WindowsGuiFactory;
import java.awt.Window;

public class AbstractFactoryWidgetClient {
       GUIFactory guiFactory;
       ScrollBar scrollBar;
       TextBox textBox;

       public AbstractFactoryWidgetClient(String Style) {
           if(Style == "Windows") {
               guiFactory = new WindowsGuiFactory();
               scrollBar = guiFactory.createScrollBar();

               textBox = guiFactory.createTextBox();
               textBox.setWidth();

           } else if (Style == "Mac") {
               guiFactory = new MacGuiFactory();
               //생성을 abstract factory class에 위임. 이 때 abstract factory method를 두고 이를 상속하는 방식으로 개별~
               scrollBar = guiFactory.createScrollBar();
               textBox = guiFactory.createTextBox();
           }
       }
}
