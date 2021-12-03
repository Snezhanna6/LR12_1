package Main;

import java.util.Observable;
import java.util.Observer;

//Начальник грабителей
public class Chief extends Observable implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        //Сообщение от носильщика
        if (o.getClass() == Porter.class) {
            //Если носильщик полицейский
            if(((Porter) o).isPolice()) {

                arrest();
            }
            else endRobbery();
        }
    }

    public void startRobbery(){
        String text = "Босс: Идем грабить банк!";
        System.out.println(text);
        setChanged();
        notifyObservers(text);
    }
    public void arrest(){
        String text = "Босс: Ограбление не состоится!";
        System.out.println(text);
        setChanged();
        notifyObservers(text);
    }

    public void endRobbery(){
        String text = "Босс: Ограбление прошло успешно!";
        System.out.println(text);
        setChanged();
        notifyObservers(text);
    }

}
