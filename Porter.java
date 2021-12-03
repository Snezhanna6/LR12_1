package Main;

import java.util.Observable;
import java.util.Observer;

// Класс носильщик
class Porter extends Observable implements Observer {

    //Полицейский
    private boolean police;

    public void setPolice(boolean police) {
        this.police = police;
    }

    public boolean isPolice() {
        return police;
    }

    @Override
    public void update(Observable o, Object arg) {
        //Если от главаря
        if (o.getClass() == Chief.class && arg.equals("Босс: Идем грабить банк!")) {
            if (police)
                arrest();
            else ready();
        }
    }

    public void arrest(){
        String text = "Носильщик: Полиция! Вы арестованы";
        System.out.println(text);
        setChanged();
        notifyObservers(text);
    }
    public void ready(){
        String text = "Носильщик: Готов!";
        System.out.println(text);
        setChanged();
        notifyObservers(text);
    }
}
