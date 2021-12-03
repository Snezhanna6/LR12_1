package Main;

//Класс грабители
public class Robbers {

    //Главарь
    private Chief chief;
    //Взломщик
    private Cracker cracker;
    //Носильщик
    private Porter porter;
    //Водитель
    private Driver driver;


    public Robbers(boolean police) {
        chief = new Chief();
        cracker = new Cracker();
        driver = new Driver();
        porter = new Porter();
        porter.setPolice(police);
        setObserverChief();
        setObserverPorter();
    }

    //Боссу ставим наблюдение за остальными грабителями
    public void setObserverChief(){
        chief.addObserver(porter);
        chief.addObserver(cracker);
        chief.addObserver(driver);
    }

    //Носильщику ставим наблюдение за остальными грабителями
    public void setObserverPorter(){
        porter.addObserver(driver);
        porter.addObserver(cracker);
        porter.addObserver(chief);
    }

    //Начать ограбление
    public void startRobbery(){
        chief.startRobbery();
    }
}
