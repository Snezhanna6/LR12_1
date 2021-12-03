package Main;

import java.util.Observable;
import java.util.Observer;

// Класс взломщик
public class Cracker  extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        //Если сообщение от главаря
        if (o.getClass() == Chief.class)
            if (arg.equals("Босс: Идем грабить банк!"))
                ready();
        if (o.getClass() == Porter.class)
            //Если носильщик полицейский
            if(((Porter) o).isPolice())
                arrest();
    }

    public void arrest(){
        System.out.println("Взломщик: Я арестован!");
    }
    public void ready(){
        System.out.println("Взломщик: Готов!");
    }
}
