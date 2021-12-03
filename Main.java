package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Носильщик полицейский?");

        boolean police;
        String select = scanner.nextLine();
        switch (select) {
            case "Да":
                police = true;
                break;
            default:
                police = false;
        }

        Robbers robbers = new Robbers(police);
        robbers.startRobbery();

    }
}
